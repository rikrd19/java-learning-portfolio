import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],     // ← ✅ Correcto para componentes standalone
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'PERSONAS-FRONTEND-ANGULAR';
}
