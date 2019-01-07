import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  nameOfClick: string='home';
  isActiveClass: boolean = false

  getID(event: any){
    // console.log(event.srcElement.id);
    this.nameOfClick = event.srcElement.id
    console.log(this.nameOfClick);
    if (this.nameOfClick ==='home'){
      console.log('fuck off')
    }
  }

  constructor() { }

  ngOnInit() {
  }

}
