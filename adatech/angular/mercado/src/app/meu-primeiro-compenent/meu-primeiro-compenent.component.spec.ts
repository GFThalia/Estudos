import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeuPrimeiroCompenentComponent } from './meu-primeiro-compenent.component';

describe('MeuPrimeiroCompenentComponent', () => {
  let component: MeuPrimeiroCompenentComponent;
  let fixture: ComponentFixture<MeuPrimeiroCompenentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MeuPrimeiroCompenentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MeuPrimeiroCompenentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
