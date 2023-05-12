(ns frontend.modules.shortcut.dicts.nb-no
  "Provides dictionary entries for shortcuts in nb-NO")

(def dict
  {:shortcut.category/formatting            "Formatering"
   :shortcut.category/basics                "Basis"
   :shortcut.category/navigating            "Navigasjon"
   :shortcut.category/block-editing         "Blokkredigering generelt"
   :shortcut.category/block-command-editing "Blokkredigering kommandoer"
   :shortcut.category/block-selection       "Blokkseleksjon (trykk ESC for å avslutte)"
   :shortcut.category/toggle                "Veksling"
   :shortcut.category/others                "Annet"
   :command.editor/indent                   "Innrykk inn"
   :command.editor/outdent                  "Innrykk ut"
   :command.editor/move-block-up            "Flytt blokk opp"
   :command.editor/move-block-down          "Flytt blokk ned"
   :command.editor/new-block                "Opprett ny blokk"
   :command.editor/new-line                 "Ny linje i nåværende blokk"
   :command.editor/zoom-in                  "Zoom inn / Fremover"
   :command.editor/zoom-out                 "Zoom ut / Tilbake"
   :command.editor/follow-link              "Følg lenke under markøren"
   :command.editor/open-link-in-sidebar     "Åpne lenke i sidestolpe"
   :command.editor/expand-block-children    "Utvid"
   :command.editor/collapse-block-children  "Slå sammen"
   :command.editor/select-block-up          "Velg blokk over"
   :command.editor/select-block-down        "Velg blokk under"
   :command.editor/select-all-blocks        "Velg alle blokker"
   :command.ui/toggle-help                  "Vis hjelp"
   :command.git/commit                      "Git commit beskjed"
   :command.go/search                       "Fulltekst søk"
   :command.go/search-in-page               "Søk på nåværende side"
   :command.ui/toggle-document-mode         "Aktiver dokumentmodus"
   :command.ui/toggle-contents              "Åpne favoritter i sidestolpen"
   :command.ui/toggle-theme                 "Veksle mellom lyst og mørkt tema"
   :command.ui/toggle-left-sidebar          "Aktiver venstre sidestolpe"
   :command.ui/toggle-right-sidebar         "Aktiver høyre sidestolpe"
   :command.ui/toggle-settings              "Åpne innstillinger"
   :command.go/journals                     "Gå til dagbok"
   :command.ui/toggle-wide-mode             "Aktiver vid-modus"
   :command.ui/toggle-brackets              "Aktiver vising av klammer"
   :command.search/re-index                 "Gjenoppbygg søkeindeks"
   :command.editor/bold                     "Fet"
   :command.editor/italics                  "Kursiv"
   :command.editor/insert-link              "HTML lenke"
   :command.editor/highlight                "Markering"
   :command.editor/undo                     "Angre"
   :command.editor/redo                     "Gjør om"
   :command.editor/copy                     "Kopier"
   :command.editor/cut                      "Klipp ut"
   :command.editor/up                       "Flytt markøren opp / Velg opp"
   :command.editor/down                     "Flytt markøren ned / Velg ned"
   :command.editor/left                     "Flytt markøren til venstre / Åpne valgt blokk på begynnelsen"
   :command.editor/right                    "Flytt markøren til høyre / Åpne valgt blokk på slutten"
   :command.editor/backspace                "Backspace / Slett bakover"
   :command.editor/delete                   "Delete / Slett forover"
   :command.editor/cycle-todo               "Veksle TODO status for valg linje"
   :command.editor/clear-block              "Slett alt innhold i blokken"
   :command.editor/kill-line-before         "Slett linje foran markøren"
   :command.editor/kill-line-after          "Slett linsje etter markøren"
   :command.editor/beginning-of-block       "Flytt markøren til begynnelsen av blokken"
   :command.editor/end-of-block             "Flytt markøren til slutten av blokken"
   :command.editor/forward-word             "Flytt markøren frem ett ord"
   :command.editor/backward-word            "Flytt markøren bakover ett ord"
   :command.editor/forward-kill-word        "Slett ett ord forover"
   :command.editor/backward-kill-word       "Slett ett ord bakover"
   :command.editor/open-edit                "Rediger valgt blokk"
   :command.editor/delete-selection         "Slett valgte blokker"
   :command.editor/toggle-open-blocks       "Veksle åpne blokker (slå sammen eller utvid alle blokker)"
   :command.auto-complete/complete "Autofullfør: Bruk valgt punkt"
   :command.auto-complete/next "Autofullfør: Velg neste punkt"
   :command.auto-complete/open-link "Autofullfør: Åpne valgt punkt i nettleser"
   :command.auto-complete/prev "Autofullfør: Velg forrige punkt"
   :command.auto-complete/shift-complete "Autofullfør: Åpne valgt punkt i sidestolpen"
   :command.cards/forgotten "Kort: Glemte"
   :command.cards/next-card "Kort: Neste kort"
   :command.cards/recall "Kort: bruk litt tid på å huske"
   :command.cards/remembered "Kort: husket"
   :command.cards/toggle-answers "Kort: vis/skjul svar/clozes"
   :command.command/run "Kjør git kommando"
   :command.command/toggle-favorite "Legg til eller fjern fra favoritter"
   :command.command-palette/toggle "Veksle kommandolinje"
   :command.date-picker/complete "Datovelger: Bruk valgt dag"
   :command.date-picker/next-day "Datovelger: Velg neste dag"
   :command.date-picker/next-week "Datovelger: Velg neste uke"
   :command.date-picker/prev-day "Datovelger: Velg forrige dag"
   :command.date-picker/prev-week "Datovelger: Velg forrige uke"
   :command.editor/copy-current-file "Kopier nåværende fil"
   :command.editor/escape-editing "Avslutt redigering"
   :command.editor/insert-youtube-timestamp "Sett inn YouTube tidsstempel"
   :command.editor/open-file-in-default-app "Åpne fil i forhåndsvalgt app"
   :command.editor/open-file-in-directory "Åpne fil i overordnet katalog"
   :command.editor/paste-text-in-one-block-at-point "Lim inn tekst i blokk ved markør"
   :command.editor/replace-block-reference-at-point "Erstatt blokkreferanse med dets innhold ved markør"
   :command.editor/select-down "Velg innhold under"
   :command.editor/select-up "Velg innhold over"
   :command.editor/strike-through "Gjennomstreking"
   :command.editor/copy-embed "Kopier en blokkinnebygging som peker til nåværende blokk"
   :command.editor/copy-text "Kopier utvalg som tekst"
   :command.go/all-pages "Gå til alle sider"
   :command.go/backward "Bakover"
   :command.go/flashcards "Veksle flashcards"
   :command.go/forward "Fremover"
   :command.go/graph-view "Gå til graf visning"
   :command.go/home "Gå hjem"
   :command.go/keyboard-shortcuts "Gå til tastatursnarveier"
   :command.go/next-journal "Gå til neste dagbok"
   :command.go/prev-journal "Gå til forrige dagbok"
   :command.go/tomorrow "Gå til i morgen"
   :command.go/all-graphs "Gå til alle grafer"
   :command.go/electron-find-in-page "Finn tekst på siden"
   :command.go/electron-jump-to-the-next "Hopp til neste treff i søket"
   :command.go/electron-jump-to-the-previous "Hopp til forrige treff i søket"
   :command.graph/add "Legg til graf"
   :command.graph/open "Velg graf for å åpne"
   :command.graph/remove "Fjern en graf"
   :command.graph/save "Lagre nåværende graf til disk"
   :command.graph/re-index "Reindekser nåværende graf"
   :command.misc/copy "mod+c"
   :command.pdf/close "Lukk nåværende pdf leser"
   :command.pdf/next-page "Neste side i nåværende pdf dok"
   :command.pdf/previous-page "Forrige side i nåværende pdf dok"
   :command.sidebar/clear "Fjern alt i høyre sidestolpe"
   :command.sidebar/open-today-page "Åpne dagens side i høyre sidestolpe"
   :command.ui/goto-plugins "Gå til dashbord for utvidelser"
             ;;  :command.ui/open-new-window "Åpne et nytt vindu"
   :command.ui/select-theme-color "Velg tilgjengelige temafarger"
   :command.ui/toggle-cards "Veksle kort"
   :command.dev/show-block-ast "(Dev) Vis blokk AST"
   :command.dev/show-block-data "(Dev) Vis blokk data"
   :command.dev/show-page-ast "(Dev) Vis side AST"
   :command.dev/show-page-data "(Dev) Vis side data"
   :command.editor/copy-page-url "Kopier side url"
   :command.editor/new-whiteboard "Nytt whiteboard"
   :command.editor/select-parent "Velg overordnet blokk"
   :command.editor/toggle-number-list "Veksle nummerliste"
   :command.editor/toggle-undo-redo-mode "Veksle angremodus (global eller kun side)"
   :command.go/whiteboards "Gå til whiteboards"
   :command.graph/export-as-html "Eksporter offentlig graf som html"
   :command.pdf/find "Pdf: Søk tekst i nåværende pdf doc"
   :command.sidebar/close-top "Lukker øverste objekt i høyre sidestolpe"
   :command.ui/clear-all-notifications "Fjern alle varsler"
   :command.ui/install-plugins-from-file "Installer plugins fra plugins.edn"
   :command.whiteboard/bring-forward "Flytt fremover"
   :command.whiteboard/bring-to-front "Flytt fremst"
   :command.whiteboard/connector "Koblingsverktøy"
   :command.whiteboard/ellipse "Ellipseverktøy"
   :command.whiteboard/eraser "Sletteverktøy"
   :command.whiteboard/group "Velg gruppe"
   :command.whiteboard/highlighter "Merkepenn"
   :command.whiteboard/lock "Lås seleksjon"
   :command.whiteboard/pan "Panoreringsverktøy"
   :command.whiteboard/pencil "Blyantverktøy"
   :command.whiteboard/portal "Portalverktøy"
   :command.whiteboard/rectangle "Rektangelverktøy"
   :command.whiteboard/reset-zoom "Tilbakestill zoom"
   :command.whiteboard/select "Valg-verktøy"
   :command.whiteboard/send-backward "Flytt bakover"
   :command.whiteboard/send-to-back "Flytt bakerst"
   :command.whiteboard/text "Tekst-verktøy"
   :command.whiteboard/toggle-grid "Veksle rutenett på lerretet"
   :command.whiteboard/ungroup "Del opp gruppe"
   :command.whiteboard/unlock "Lås opp seleksjon"
   :command.whiteboard/zoom-in "Zoom inn"
   :command.whiteboard/zoom-out "Zoom ut"
   :command.whiteboard/zoom-to-fit "Zoom til tegning"
   :command.whiteboard/zoom-to-selection "Zoom for å passe seleksjonen"
   :shortcut.category/whiteboard "Whiteboard"})
