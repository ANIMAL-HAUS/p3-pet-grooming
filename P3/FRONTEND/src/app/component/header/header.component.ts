

import { Component, OnInit } from '@angular/core';
import { Users } from 'src/app/models/Users';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  // public totalItem : number = 0;
user: Users;
id: 0;
  constructor() { }

  ngOnInit(): void {
    // this.cartService.getProducts()
    // .subscribe(res=>{
    //   this.totalItem = res.length;
    // })
  }

}
