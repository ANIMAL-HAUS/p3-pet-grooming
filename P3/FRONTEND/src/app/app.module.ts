import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './component/register/register.component';
import { ContractorProfileComponent } from './component/contractor-profile/contractor-profile.component';
import { CustomerProfileComponent } from './component/customer-profile/customer-profile.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { GroomingComponent } from './component/grooming/grooming.component';
import { RegisterCustomerComponent } from './component/register-customer/register-customer.component';
import { HttpClientModule } from '@angular/common/http';
import { AllLoginComponent } from './component/all-login/all-login.component';
import { CartComponent } from './component/cart/cart.component';


@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ContractorProfileComponent,
    CustomerProfileComponent,
    DashboardComponent,
    HeaderComponent,
    FooterComponent,
    GroomingComponent,
    RegisterCustomerComponent,
    AllLoginComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
