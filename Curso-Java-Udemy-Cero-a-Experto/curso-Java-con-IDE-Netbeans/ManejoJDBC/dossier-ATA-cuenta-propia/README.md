# Dossier ATA — Residencia y trabajo por cuenta propia

Business plan package for the modification from student stay to self-employment residence (Spain / Tarragona).

## Contents

| File | Purpose |
| --- | --- |
| `01_Plan_de_Empresa_ATA.md` | Full business plan (convert to Word) |
| `Plan_Financiero_3_Anos_ATA.xlsx` | 3-year finances, scenarios, charts |
| `02_Checklist_Anexos_y_Maquetacion.md` | Annex checklist + 30–40 page layout guide |
| `03_Contrato_Prestamo_Familiar_Plantilla.md` | Family loan template (10,000 EUR) |
| `04_Cesion_Uso_Equipos_Plantilla.md` | Equipment use assignment (if invoices in Renzo’s name) |
| `generate_financials.py` | Regenerates the Excel workbook |

## Quick start

1. Replace all `[...]` placeholders in the Plan and templates.  
2. Adjust CapEx amounts in Excel sheet `CapEx_Inventory` to match invoices.  
3. Gather annexes (loan + Modelo 600 + transfer + invoices + diploma).  
4. Paste into Word following the layout guide.  
5. Submit to ATA; then file EX-26 with the ATA report.

## Regenerate Excel

```bash
cd dossier-ATA-cuenta-propia
.venv/bin/python generate_financials.py
```

## Disclaimer

This package is a technical-economic memorandum for ATA evaluation. It is not legal advice and does not replace a lawyer/gestor review of Modelo 600, EX-26 filings, or tax obligations.
