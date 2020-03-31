import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  name = "Grant MacLaren";
  personalId = "535";
  personalLink = "https://devb.zoomdev.us/j/";
  mail = "";
  language = "English";
  timeZone = "(GMT-5:00) Central Time (US and Canada)"
  dateFormat = "mm/yy/dd";
  password = "******";
  phoneNumber = "";



  constructor() { }

  ngOnInit() {
  }

}
