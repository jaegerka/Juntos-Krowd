import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer: boolean = false;
  serverCreationStatus: string = 'no server created';
  serverName: string = '';
  serverCreated: boolean= false;
  servers = ['testServer', 'testserver2']
  constructor() {
    setTimeout(()=>{this.allowNewServer=true},2200)
   }

  ngOnInit() {
  }

  onCreateServer(nameInput: HTMLInputElement){
    console.log(nameInput.value);
    this.servers.push(nameInput.value);
    this.serverCreated =true;
    this.serverCreationStatus = 'server created' +this.serverName;
  }

  onUpdateServerName(event: any){
    this.serverName= (<HTMLInputElement>event.target).value;
    console.log(event);
  }

}
