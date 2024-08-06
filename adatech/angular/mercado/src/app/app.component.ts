import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MeuPrimeiroCompenentComponent } from "./meu-primeiro-compenent/meu-primeiro-compenent.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, MeuPrimeiroCompenentComponent]
})
export class AppComponent {
  title = 'mercado';
}
