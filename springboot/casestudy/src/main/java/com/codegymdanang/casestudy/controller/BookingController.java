package com.codegymdanang.casestudy.controller;

import com.codegymdanang.casestudy.entity.FuramaDichvu;
import com.codegymdanang.casestudy.entity.FuramaHopDong;
import com.codegymdanang.casestudy.service.DichVuService;
import com.codegymdanang.casestudy.service.HopDongService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

@Controller
public class BookingController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    HopDongService hopDongService;
    @GetMapping("/booking/{id}")
    public ModelAndView getBookingpage(@PathVariable(value = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("dichvu/booking");
        FuramaDichvu furamaDichvu = dichVuService.getDichVu(id);
        modelAndView.addObject("dichvu",furamaDichvu);
      //  FuramaHopDong furamaHopDong=new FuramaHopDong();
        //cho nay sao setiddichvu
      //  furamaHopDong.setIddichvu(id);
        return modelAndView;

    }
    @PostMapping("/booking")
    public ModelAndView saveBooking(@RequestParam(value = "id") Long id, @RequestParam(value = "ngaybatdau")Date ngaybatdau,
                                    @RequestParam(value = "ngayketthuc") Date ngayketthuc, HttpServletRequest request, HttpServletResponse response){
        FuramaHopDong furamaHopDong = new FuramaHopDong();
        furamaHopDong.setIddichvu(id);
        furamaHopDong.setNgayLamHopDong(ngaybatdau);
        furamaHopDong.setNgayKetThuc(ngayketthuc);
        furamaHopDong.setTienDatcoc(10000);
        furamaHopDong.setTongTien(24567675);
        furamaHopDong.setIdKhachHang((long) 1);
        furamaHopDong.setIdNhanVien((long) 1);
        hopDongService.saveHopDong(furamaHopDong);

        Iterable<FuramaHopDong> listhopdong = hopDongService.findAllByIdKhachHang((long) 1);
        for (FuramaHopDong hopDong:listhopdong){
            String cookieValue= hopDong.getIdHopDong() + "_" + hopDong.getIddichvu() + "_" +hopDong.getNgayLamHopDong()
                    + "_" +hopDong.getNgayKetThuc();
            Cookie cookie=new Cookie("hopdong" + hopDong.getIdHopDong(),cookieValue);
            cookie.setMaxAge(60*60);
            cookie.setPath("/history");
            response.addCookie(cookie);
        }

        ModelAndView modelAndView = new ModelAndView("dichvu/bookingSuccess");
        return modelAndView;
    }
}
