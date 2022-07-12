import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllLoginComponent } from './component/all-login/all-login.component';
import { CartComponent } from './component/cart/cart.component';
import { ContractorProfileComponent } from './component/contractor-profile/contractor-profile.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { GroomingComponent } from './component/grooming/grooming.component';
import { RegisterCustomerComponent } from './component/register-customer/register-customer.component';
import { RegisterComponent } from './component/register/register.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  {path: 'register', component: RegisterComponent},
  { path: 'register-customer', component: RegisterCustomerComponent},
  {path: 'grooming', component: GroomingComponent},
  { path: 'contractor-profile', component: ContractorProfileComponent},
  { path: 'all-login', component: AllLoginComponent},
  { path: 'cart', component: CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
