import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tonghop-edit',
  templateUrl: './tonghop-edit.component.html',
  styleUrls: ['./tonghop-edit.component.css']
})
export class TonghopEditComponent implements OnInit {

  cochu = 14;
  tenthu = 'puppie';
  hinhanh = 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg';

  soA : number;
  soB : number;
  ketqua : number;
  pheptinh = '+';

  DoiSoA(value){
    this.soA = Number(value);
  }
  DoisoB(value){
    this.soB = Number(value);
  }
  Pheptinh(value){
    this.pheptinh = value;
  }
  
  thuchien(){
    switch (this.pheptinh) {
      case '+':
        this.ketqua = this.soA + this.soB;
        break;

      case '-':
          this.ketqua = this.soA - this.soB;
        break;
      
      case '*':
          this.ketqua = this.soA * this.soB;
        break;

      case '/':
          this.ketqua = this.soA / this.soB;
        break;
  
    }
  }
  
  onChange(kichco){
    this.cochu = kichco;
  }
  CapNhatThu(ten){
    this.tenthu = ten;
  }
  CapNhatAnh(anh){
    this.hinhanh = anh;
  }




  constructor() { }

  ngOnInit() {
  }

}
