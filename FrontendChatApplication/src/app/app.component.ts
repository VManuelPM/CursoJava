import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ChatComponent} from './components/chat/chat.component';

@Component({
  selector: 'app-root',
  imports: [
    ChatComponent
  ],
  templateUrl: './app.component.html',
})
export class AppComponent {
}
