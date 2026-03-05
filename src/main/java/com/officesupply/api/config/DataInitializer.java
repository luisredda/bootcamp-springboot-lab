package com.officesupply.api.config;

import com.officesupply.api.model.OfficeSupply;
import com.officesupply.api.repository.OfficeSupplyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OfficeSupplyRepository repository;

    public DataInitializer(OfficeSupplyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() > 0) return;

        repository.saveAll(List.of(
            // Writing Instruments (15)
            new OfficeSupply("Ballpoint Pen Blue", "Writing Instruments", "Smooth-writing blue ink ballpoint pen", new BigDecimal("1.49"), 500, "WI-001", "BIC"),
            new OfficeSupply("Ballpoint Pen Black", "Writing Instruments", "Smooth-writing black ink ballpoint pen", new BigDecimal("1.49"), 500, "WI-002", "BIC"),
            new OfficeSupply("Ballpoint Pen Red", "Writing Instruments", "Smooth-writing red ink ballpoint pen", new BigDecimal("1.49"), 300, "WI-003", "BIC"),
            new OfficeSupply("Gel Pen Set 12-Pack", "Writing Instruments", "Assorted color gel pens, 12-pack", new BigDecimal("9.99"), 200, "WI-004", "Pilot"),
            new OfficeSupply("Mechanical Pencil 0.5mm", "Writing Instruments", "Precision mechanical pencil with 0.5mm lead", new BigDecimal("4.99"), 250, "WI-005", "Pentel"),
            new OfficeSupply("Mechanical Pencil 0.7mm", "Writing Instruments", "Precision mechanical pencil with 0.7mm lead", new BigDecimal("4.99"), 250, "WI-006", "Pentel"),
            new OfficeSupply("Highlighter Yellow", "Writing Instruments", "Chisel tip yellow highlighter, smear-resistant", new BigDecimal("2.29"), 400, "WI-007", "Sharpie"),
            new OfficeSupply("Highlighter Set 5-Color", "Writing Instruments", "5-color highlighter set for color-coded notes", new BigDecimal("7.99"), 150, "WI-008", "Sharpie"),
            new OfficeSupply("Permanent Marker Black", "Writing Instruments", "Fine-tip permanent marker, waterproof ink", new BigDecimal("2.49"), 350, "WI-009", "Sharpie"),
            new OfficeSupply("Whiteboard Marker Set", "Writing Instruments", "4-color dry-erase marker set", new BigDecimal("6.99"), 180, "WI-010", "Expo"),
            new OfficeSupply("Fountain Pen", "Writing Instruments", "Classic stainless steel fountain pen", new BigDecimal("19.99"), 80, "WI-011", "Parker"),
            new OfficeSupply("Rollerball Pen", "Writing Instruments", "Smooth rollerball pen with liquid ink", new BigDecimal("5.99"), 200, "WI-012", "Uniball"),
            new OfficeSupply("Pencil #2 12-Pack", "Writing Instruments", "Standard #2 wooden pencils, pre-sharpened", new BigDecimal("4.49"), 300, "WI-013", "Dixon"),
            new OfficeSupply("Colored Pencil Set 24", "Writing Instruments", "24-color professional colored pencil set", new BigDecimal("12.99"), 120, "WI-014", "Prismacolor"),
            new OfficeSupply("Correction Pen", "Writing Instruments", "Quick-dry correction fluid pen", new BigDecimal("2.99"), 220, "WI-015", "Wite-Out"),

            // Paper Products (15)
            new OfficeSupply("Copy Paper Ream 500 sheets", "Paper Products", "Multipurpose 8.5x11 copy paper, 20lb", new BigDecimal("8.99"), 400, "PP-001", "Hammermill"),
            new OfficeSupply("Legal Pad Yellow", "Paper Products", "Ruled yellow legal pad, 8.5x14, 50 sheets", new BigDecimal("3.49"), 300, "PP-002", "Ampad"),
            new OfficeSupply("Sticky Notes 3x3 100pk", "Paper Products", "Classic yellow self-stick notes, 100 sheets", new BigDecimal("3.99"), 500, "PP-003", "Post-it"),
            new OfficeSupply("Sticky Notes Multicolor", "Paper Products", "Assorted color 3x3 sticky notes, 5-pack", new BigDecimal("8.49"), 200, "PP-004", "Post-it"),
            new OfficeSupply("Spiral Notebook College Ruled", "Paper Products", "100-sheet college-ruled spiral notebook", new BigDecimal("4.99"), 250, "PP-005", "Five Star"),
            new OfficeSupply("Composition Notebook", "Paper Products", "100-sheet wide-ruled composition book", new BigDecimal("3.29"), 300, "PP-006", "Mead"),
            new OfficeSupply("Graph Paper Pad", "Paper Products", "4x4 grid graph paper pad, 50 sheets", new BigDecimal("5.49"), 150, "PP-007", "Staples"),
            new OfficeSupply("Index Cards 4x6 100pk", "Paper Products", "Ruled index cards, 100-pack", new BigDecimal("2.99"), 350, "PP-008", "Oxford"),
            new OfficeSupply("Manila Folders Letter 25pk", "Paper Products", "Kraft manila file folders, 25-pack", new BigDecimal("6.99"), 200, "PP-009", "Smead"),
            new OfficeSupply("Hanging File Folders 25pk", "Paper Products", "Letter-size hanging folders with tabs, 25-pack", new BigDecimal("14.99"), 150, "PP-010", "Pendaflex"),
            new OfficeSupply("Cardstock 8.5x11 50pk", "Paper Products", "65lb white cardstock, 50 sheets", new BigDecimal("9.99"), 180, "PP-011", "Astrobrights"),
            new OfficeSupply("Envelopes #10 100pk", "Paper Products", "Standard business envelopes, 100-pack", new BigDecimal("7.49"), 250, "PP-012", "Mead"),
            new OfficeSupply("Padfolio with Notepad", "Paper Products", "Faux leather padfolio with ruled notepad", new BigDecimal("18.99"), 90, "PP-013", "Office Designs"),
            new OfficeSupply("Printer Labels Sheet 30pk", "Paper Products", "Laser/inkjet address labels, 30 per sheet", new BigDecimal("11.99"), 160, "PP-014", "Avery"),
            new OfficeSupply("Bubble Mailers 10pk", "Paper Products", "Padded kraft bubble mailers, 10-pack", new BigDecimal("9.49"), 200, "PP-015", "Sealed Air"),

            // Binders & Organization (10)
            new OfficeSupply("3-Ring Binder 1-inch", "Binders & Organization", "Durable 1-inch D-ring binder, holds 200 sheets", new BigDecimal("5.99"), 200, "BO-001", "Avery"),
            new OfficeSupply("3-Ring Binder 2-inch", "Binders & Organization", "Heavy-duty 2-inch D-ring binder", new BigDecimal("8.49"), 180, "BO-002", "Avery"),
            new OfficeSupply("3-Ring Binder 3-inch", "Binders & Organization", "Extra-capacity 3-inch D-ring binder", new BigDecimal("10.99"), 150, "BO-003", "Avery"),
            new OfficeSupply("Binder Dividers 8-Tab", "Binders & Organization", "Multicolor 8-tab binder dividers with labels", new BigDecimal("3.99"), 300, "BO-004", "Avery"),
            new OfficeSupply("Expanding File Accordion", "Binders & Organization", "13-pocket expanding file organizer, A-Z", new BigDecimal("12.99"), 130, "BO-005", "Pendaflex"),
            new OfficeSupply("Desktop File Organizer", "Binders & Organization", "5-tier metal desktop file and mail organizer", new BigDecimal("22.99"), 80, "BO-006", "Rolodex"),
            new OfficeSupply("Magazine File Holder", "Binders & Organization", "Stackable metal magazine and file holder", new BigDecimal("9.99"), 150, "BO-007", "Steelmaster"),
            new OfficeSupply("Binder Clips Large 12pk", "Binders & Organization", "Large metal binder clips, 12-pack", new BigDecimal("3.49"), 400, "BO-008", "Officemate"),
            new OfficeSupply("Binder Clips Assorted 30pk", "Binders & Organization", "Assorted size binder clips, 30-pack", new BigDecimal("5.49"), 350, "BO-009", "Officemate"),
            new OfficeSupply("Clipboard Letter Size", "Binders & Organization", "Low-profile clip letter-size clipboard", new BigDecimal("4.49"), 200, "BO-010", "Officemate"),

            // Desk Accessories (15)
            new OfficeSupply("Stapler Desktop", "Desk Accessories", "Full-strip desktop stapler, 20-sheet capacity", new BigDecimal("12.99"), 150, "DA-001", "Swingline"),
            new OfficeSupply("Staples 5000pk", "Desk Accessories", "Standard staples for full-strip staplers, 5000pk", new BigDecimal("4.99"), 400, "DA-002", "Swingline"),
            new OfficeSupply("3-Hole Punch", "Desk Accessories", "Heavy-duty desktop 3-hole punch, 10-sheet", new BigDecimal("14.99"), 100, "DA-003", "Swingline"),
            new OfficeSupply("Tape Dispenser with Tape", "Desk Accessories", "Weighted base tape dispenser with 1 roll tape", new BigDecimal("8.99"), 180, "DA-004", "Scotch"),
            new OfficeSupply("Scotch Tape Refill 3pk", "Desk Accessories", "Magic transparent tape refill rolls, 3-pack", new BigDecimal("5.49"), 300, "DA-005", "Scotch"),
            new OfficeSupply("Scissors 8-inch", "Desk Accessories", "Comfort-grip 8-inch stainless steel scissors", new BigDecimal("6.99"), 200, "DA-006", "Fiskars"),
            new OfficeSupply("Letter Opener", "Desk Accessories", "Stainless steel letter opener with ruler", new BigDecimal("5.99"), 150, "DA-007", "Officemate"),
            new OfficeSupply("Pen Cup Organizer", "Desk Accessories", "Mesh metal desktop pen and supply organizer", new BigDecimal("9.99"), 120, "DA-008", "Rolodex"),
            new OfficeSupply("Desk Calendar 2025", "Desk Accessories", "Daily tear-off desk calendar with stand", new BigDecimal("7.99"), 200, "DA-009", "AT-A-GLANCE"),
            new OfficeSupply("Rubber Bands Assorted 1lb", "Desk Accessories", "Assorted size rubber bands, 1 lb bag", new BigDecimal("4.29"), 250, "DA-010", "Alliance"),
            new OfficeSupply("Paper Clips Standard 100pk", "Desk Accessories", "Smooth silver paper clips, 100-pack", new BigDecimal("1.99"), 500, "DA-011", "Acco"),
            new OfficeSupply("Pushpins 100pk Assorted", "Desk Accessories", "Assorted color push pins, 100-pack", new BigDecimal("2.99"), 400, "DA-012", "Officemate"),
            new OfficeSupply("Magnifying Glass", "Desk Accessories", "5x desktop magnifying glass with LED light", new BigDecimal("16.99"), 70, "DA-013", "Carson"),
            new OfficeSupply("Wrist Rest Mousepad", "Desk Accessories", "Ergonomic gel wrist rest and mousepad", new BigDecimal("14.99"), 130, "DA-014", "3M"),
            new OfficeSupply("Monitor Stand Riser", "Desk Accessories", "Adjustable laptop and monitor riser stand", new BigDecimal("29.99"), 80, "DA-015", "AmazonBasics"),

            // Printing & Imaging (10)
            new OfficeSupply("Black Ink Cartridge HP", "Printing & Imaging", "HP 63 black ink cartridge for HP printers", new BigDecimal("22.99"), 120, "PI-001", "HP"),
            new OfficeSupply("Color Ink Cartridge HP", "Printing & Imaging", "HP 63 tri-color ink cartridge", new BigDecimal("26.99"), 100, "PI-002", "HP"),
            new OfficeSupply("Black Toner Cartridge Canon", "Printing & Imaging", "Canon 045 black toner cartridge", new BigDecimal("59.99"), 60, "PI-003", "Canon"),
            new OfficeSupply("Photo Paper 4x6 100pk", "Printing & Imaging", "Glossy photo paper 4x6, 100 sheets", new BigDecimal("13.99"), 150, "PI-004", "Canon"),
            new OfficeSupply("Photo Paper 8.5x11 25pk", "Printing & Imaging", "Premium glossy photo paper letter size, 25pk", new BigDecimal("16.99"), 100, "PI-005", "Epson"),
            new OfficeSupply("Transparency Film 50pk", "Printing & Imaging", "Clear transparency film for laser printers", new BigDecimal("24.99"), 80, "PI-006", "3M"),
            new OfficeSupply("Label Maker Tape 12mm", "Printing & Imaging", "Black-on-white label maker tape, 12mm", new BigDecimal("11.49"), 200, "PI-007", "Brother"),
            new OfficeSupply("CD-R Disc 50pk", "Printing & Imaging", "700MB 52x recordable CD discs, 50-pack", new BigDecimal("14.99"), 120, "PI-008", "Verbatim"),
            new OfficeSupply("USB Flash Drive 32GB", "Printing & Imaging", "USB 3.0 flash drive, 32GB storage", new BigDecimal("12.99"), 200, "PI-009", "SanDisk"),
            new OfficeSupply("Printer Cleaning Kit", "Printing & Imaging", "Universal printer cleaning kit with swabs", new BigDecimal("9.99"), 90, "PI-010", "Read-Right"),

            // Mailing & Shipping (10)
            new OfficeSupply("Shipping Tape 6pk", "Mailing & Shipping", "2-inch heavy-duty packing tape, 6 rolls", new BigDecimal("13.99"), 200, "MS-001", "Scotch"),
            new OfficeSupply("Corrugated Shipping Boxes 10pk", "Mailing & Shipping", "12x12x12 single-wall corrugated boxes, 10pk", new BigDecimal("19.99"), 150, "MS-002", "Uline"),
            new OfficeSupply("Bubble Wrap Roll 12in x 10ft", "Mailing & Shipping", "Small-bubble cushioning wrap roll", new BigDecimal("8.99"), 180, "MS-003", "Sealed Air"),
            new OfficeSupply("Packing Peanuts 1 cu ft", "Mailing & Shipping", "Loose-fill packing peanuts, 1 cubic foot bag", new BigDecimal("11.99"), 120, "MS-004", "Ranpak"),
            new OfficeSupply("Postage Scale Digital", "Mailing & Shipping", "Digital postal scale up to 55 lb with USB", new BigDecimal("34.99"), 60, "MS-005", "Dymo"),
            new OfficeSupply("Return Address Labels 250pk", "Mailing & Shipping", "Personalized peel-and-stick address labels", new BigDecimal("7.99"), 250, "MS-006", "Avery"),
            new OfficeSupply("Fragile Stickers 100pk", "Mailing & Shipping", "Red Fragile Handle with Care stickers", new BigDecimal("4.99"), 300, "MS-007", "Juvale"),
            new OfficeSupply("Poly Mailers 10x13 25pk", "Mailing & Shipping", "Self-sealing polyethylene mailer bags, 25pk", new BigDecimal("8.49"), 200, "MS-008", "Uline"),
            new OfficeSupply("Packing Tape Dispenser", "Mailing & Shipping", "Heavy-duty tape gun dispenser for 2-inch tape", new BigDecimal("11.99"), 130, "MS-009", "Scotch"),
            new OfficeSupply("Label Printer Thermal", "Mailing & Shipping", "Wireless thermal label printer for shipping", new BigDecimal("79.99"), 40, "MS-010", "Dymo"),

            // Furniture & Ergonomics (10)
            new OfficeSupply("Ergonomic Chair Cushion", "Furniture & Ergonomics", "Memory foam seat cushion for office chairs", new BigDecimal("29.99"), 100, "FE-001", "ComfiLife"),
            new OfficeSupply("Lumbar Support Pillow", "Furniture & Ergonomics", "Adjustable lumbar cushion with strap", new BigDecimal("24.99"), 90, "FE-002", "Everlasting Comfort"),
            new OfficeSupply("Footrest Adjustable", "Furniture & Ergonomics", "Under-desk ergonomic foot rest, adjustable height", new BigDecimal("34.99"), 70, "FE-003", "Humanscale"),
            new OfficeSupply("Document Holder Clip", "Furniture & Ergonomics", "Adjustable copyholder for monitor attachment", new BigDecimal("18.99"), 80, "FE-004", "3M"),
            new OfficeSupply("Keyboard Wrist Rest", "Furniture & Ergonomics", "Memory foam keyboard wrist rest pad", new BigDecimal("12.99"), 120, "FE-005", "3M"),
            new OfficeSupply("Monitor Arm Single", "Furniture & Ergonomics", "Full motion single monitor arm, desk clamp", new BigDecimal("49.99"), 50, "FE-006", "Ergotron"),
            new OfficeSupply("Cable Management Clips 20pk", "Furniture & Ergonomics", "Adhesive cable organizer clips, 20-pack", new BigDecimal("7.99"), 200, "FE-007", "OHill"),
            new OfficeSupply("Standing Desk Converter", "Furniture & Ergonomics", "Height-adjustable sit-stand desk riser", new BigDecimal("149.99"), 30, "FE-008", "VARIDESK"),
            new OfficeSupply("Desk Drawer Organizer", "Furniture & Ergonomics", "Expandable desktop drawer organizer tray", new BigDecimal("16.99"), 100, "FE-009", "SimpleHouseware"),
            new OfficeSupply("Book Stand Adjustable", "Furniture & Ergonomics", "Foldable book and tablet stand holder", new BigDecimal("21.99"), 85, "FE-010", "Staples"),

            // Cleaning & Safety (15)
            new OfficeSupply("Screen Cleaning Kit", "Cleaning & Safety", "Monitor screen cleaning spray and microfiber cloth", new BigDecimal("8.99"), 200, "CS-001", "Screen Mom"),
            new OfficeSupply("Keyboard Cleaning Brush", "Cleaning & Safety", "Soft-bristle keyboard cleaning brush set", new BigDecimal("5.99"), 250, "CS-002", "OXO"),
            new OfficeSupply("Compressed Air Duster 3pk", "Cleaning & Safety", "Compressed air for electronics cleaning, 3-pack", new BigDecimal("14.99"), 180, "CS-003", "Falcon"),
            new OfficeSupply("Hand Sanitizer Pump 12oz", "Cleaning & Safety", "70% alcohol gel hand sanitizer, 12 oz pump", new BigDecimal("6.99"), 300, "CS-004", "Purell"),
            new OfficeSupply("Disinfecting Wipes 75pk", "Cleaning & Safety", "Bleach-free disinfecting wipes, 75-count", new BigDecimal("5.49"), 400, "CS-005", "Clorox"),
            new OfficeSupply("First Aid Kit 50-Piece", "Cleaning & Safety", "Comprehensive 50-piece first aid kit in case", new BigDecimal("22.99"), 80, "CS-006", "Johnson & Johnson"),
            new OfficeSupply("Microfiber Cleaning Cloths 6pk", "Cleaning & Safety", "Lint-free microfiber cloths, 6-pack", new BigDecimal("9.99"), 200, "CS-007", "AmazonBasics"),
            new OfficeSupply("Trash Bags 13gal 40pk", "Cleaning & Safety", "Kitchen/office 13-gallon trash bags, 40-pack", new BigDecimal("12.99"), 250, "CS-008", "Glad"),
            new OfficeSupply("Paper Towels 6-Roll", "Cleaning & Safety", "Select-a-size paper towels, 6 double rolls", new BigDecimal("11.49"), 200, "CS-009", "Bounty"),
            new OfficeSupply("Safety Glasses Clear", "Cleaning & Safety", "ANSI Z87.1 safety glasses, clear lens", new BigDecimal("7.99"), 120, "CS-010", "3M"),
            new OfficeSupply("Fire Extinguisher 2.5lb", "Cleaning & Safety", "ABC dry chemical fire extinguisher, 2.5 lb", new BigDecimal("39.99"), 40, "CS-011", "Kidde"),
            new OfficeSupply("Surge Protector 6-Outlet", "Cleaning & Safety", "6-outlet surge protector with 6ft cord, 900J", new BigDecimal("19.99"), 150, "CS-012", "APC"),
            new OfficeSupply("Extension Cord 25ft", "Cleaning & Safety", "3-prong grounded 25 ft extension cord", new BigDecimal("14.99"), 120, "CS-013", "Coleman Cable"),
            new OfficeSupply("Anti-Fatigue Mat 20x32", "Cleaning & Safety", "Comfort anti-fatigue standing mat, 20x32 in", new BigDecimal("27.99"), 80, "CS-014", "Topo"),
            new OfficeSupply("Shredder Cross-Cut", "Cleaning & Safety", "8-sheet cross-cut paper shredder with basket", new BigDecimal("59.99"), 50, "CS-015", "AmazonBasics")
        ));
    }
}
