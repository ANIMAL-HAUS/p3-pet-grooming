import { Component, OnInit } from '@angular/core';
import { ServicesService } from 'src/app/service/services.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Users } from '../../models/Users';
import { BehaviorSubject } from 'rxjs';
import { Product } from 'src/app/models/Product';

@Component({
  selector: 'app-grooming',
  templateUrl: './grooming.component.html',
  styleUrls: ['./grooming.component.css']
})
export class GroomingComponent implements OnInit {
  users!: Array<Users>;
  products!: Array<Product>;
  action!: string;

  selectedUser!: Users;
  public cartItemList : any =[]
  public productList = new BehaviorSubject<any>([]);

  constructor(private ServicesService: ServicesService, 
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
   this.ServicesService.getContractors()
   .subscribe(res=>{
     this.users = res;
    })
    // this.ServicesService.getServices()
    // .subscribe(res=>{
    //   this.products=res;
    // })
   
   console.log(this.users);
  }
  
  addtoCart(product : any){
    this.cartItemList.push(product);
    this.productList.next(this.cartItemList);
    console.log(this.cartItemList)
  }
}
