import { Component, OnInit } from '@angular/core';
import { products } from '../products'

@Component({
  selector: 'app-produce-list',
  templateUrl: './produce-list.component.html',
  styleUrls: ['./produce-list.component.css']
})
export class ProduceListComponent implements OnInit {

  products = products;

  share() {
    window.alert('The product has been shared!');
  } 

  onNotify() {
    window.alert('You will be notified when the product goes on sale');
  }
  
  constructor() { }

  ngOnInit(): void {
  }

}
