(ns frontend.modules.shortcut.dicts.ru
  "Provides dictionary entries for shortcuts in RU")

(def dict
  {:shortcut.category/basics                "Базовые"
   :shortcut.category/formatting            "Форматирование"
   :shortcut.category/navigating            "Навигация"
   :shortcut.category/block-editing         "Общее редактирование блока"
   :shortcut.category/block-command-editing "Команды редактирования блока"
   :shortcut.category/block-selection       "Выделение блоков (нажмите Esc для отмены)"
   :shortcut.category/toggle                "Переключатели"
   :shortcut.category/others                "Разное"
   :command.date-picker/complete            "Выбор даты: Выбрать указанный день"
   :command.date-picker/prev-day            "Выбор даты: Выбрать предыдущий день"
   :command.date-picker/next-day            "Выбор даты: Выбрать следующий день"
   :command.date-picker/prev-week           "Выбор даты: Выбрать предыдущую неделю"
   :command.date-picker/next-week           "Выбор даты: Выбрать следующую неделю"
   :command.pdf/previous-page               "Предыдущая страница текущего PDF"
   :command.pdf/next-page                   "Следующая страница текущего PDF"
   :command.pdf/close                       "Закрыть текущий просмотр PDF"
   :command.pdf/find                        "Pdf: Поиск текста в текущем PDF-документе"
   :command.auto-complete/complete          "Автодополнение: Использовать выбранный элемент"
   :command.auto-complete/prev              "Автодополнение: Выбрать предыдущий"
   :command.auto-complete/next              "Автодополнение: Выбрать следующий"
   :command.auto-complete/shift-complete    "Автодополнение: Открыть выбранный элемент в боковой панели"
   :command.auto-complete/open-link         "Автодополнение: Открыть выбранный элемент в браузере"
   :command.cards/toggle-answers            "Карточки: показать/скрыть ответы/clozes"
   :command.cards/next-card                 "Карточки: следующая карточка"
   :command.cards/forgotten                 "Карточки: забытая"
   :command.cards/remembered                "Карточки: запомненная"
   :command.cards/recall                    "Карточки: нужно время, чтобы вспомнить"
   :command.editor/escape-editing           "Выйти из режима редактирования"
   :command.editor/backspace                "Удалить перед курсором"
   :command.editor/delete                   "Удалить после курсора"
   :command.editor/new-block                "Создать новый блок"
   :command.editor/new-line                 "Новая строка в блоке"
   :command.editor/new-whiteboard           "Новая интерактивная доска"
   :command.editor/follow-link              "Перейти по ссылке под курсором"
   :command.editor/open-link-in-sidebar     "Открыть ссылку в боковой панели"
   :command.editor/bold                     "Жирный"
   :command.editor/italics                  "Курсив"
   :command.editor/highlight                "Выделение"
   :command.editor/strike-through           "Перечёркнутый"
   :command.editor/clear-block              "Удалить содержимое блока"
   :command.editor/kill-line-before         "Удалить строку до курсора"
   :command.editor/copy-embed               "Копировать вставку, ссылающуюся на текущий блок"
   :command.editor/kill-line-after          "Удалить строку после курсора"
   :command.editor/beginning-of-block       "Переместить курсор в начало блока"
   :command.editor/end-of-block             "Переместить курсор в конец блока"
   :command.editor/forward-word             "Переместить курсор на одно слово вперед"
   :command.editor/backward-word            "Переместить курсор на одно слово назад"
   :command.editor/forward-kill-word        "Удалить следующее слово"
   :command.editor/backward-kill-word       "Удалить предыдущее слово"
   :command.editor/replace-block-reference-at-point "Заменить ссылку на блок своим содержимым в указанном месте"
   :command.editor/paste-text-in-one-block-at-point "Вставить текст в один блок в указанном месте"
   :command.editor/insert-youtube-timestamp "Вставить временную метку на Youtube"
   :command.editor/cycle-todo               "Переключить статус данной задачи (TODO)"
   :command.editor/up                       "Переместить курсор вверх / Выбрать вверх"
   :command.editor/down                     "Переместить курсор вниз / Выбрать вниз"
   :command.editor/left                     "Переместить курсор влево / Открыть выбранный блок в начале"
   :command.editor/right                    "Переместить курсор вправо / Открыть выбранный блок в конце"
   :command.editor/select-up                "Выбрать контент выше"
   :command.editor/select-down              "Выбрать контент ниже"
   :command.editor/move-block-up            "Передвинуть блок выше"
   :command.editor/move-block-down          "Передвинуть блок ниже"
   :command.editor/open-edit                "Редактировать выбранный блок"
   :command.editor/select-block-up          "Выбрать блок выше"
   :command.editor/select-block-down        "Выбрать блок ниже"
   :command.editor/delete-selection         "Удалить выбранные блоки"
   :command.editor/expand-block-children    "Раскрыть"
   :command.editor/collapse-block-children  "Свернуть"
   :command.editor/indent                   "Увеличить отступ блока"
   :command.editor/outdent                  "Уменьшить отступ блока"
   :command.editor/copy                     "Копировать (выделенное либо ссылку на блок)"
   :command.editor/copy-text                "Копировать как текст"
   :command.editor/cut                      "Вырезать"
   :command.editor/undo                     "Отменить"
   :command.editor/redo                     "Вернуть"
   :command.editor/insert-link              "HTML ссылка"
   :command.editor/select-all-blocks        "Выбрать все блоки"
   :command.editor/select-parent            "Выбрать родительский блок"
   :command.editor/zoom-in                  "Увеличить / Вперед"
   :command.editor/zoom-out                 "Уменьшить / Назад"
   :command.ui/toggle-brackets              "Переключить отображение скобок"
   :command.go/search-in-page               "Поиск блоков на текущей странице"
   :command.go/electron-find-in-page        "Поиск текста на странице"
   :command.go/electron-jump-to-the-next    "Перейти к следующему совпадению в строке поиска"
   :command.go/electron-jump-to-the-previous "Перейти к предыдущему совпадению в строке поиска"
   :command.go/search                       "Поиск страниц и блоков"
   :command.go/journals                     "Перейти в журналы"
   :command.go/backward                     "Назад"
   :command.go/forward                      "Вперёд"
   :command.search/re-index                 "Переиндексация поиска"
   :command.sidebar/open-today-page         "Открыть сегодняшнюю страницу в правой боковой панели"
   :command.sidebar/close-top               "Закрыть верхний элемент в правой боковой панели"
   :command.sidebar/clear                   "Очистить правую панель"
   :command.misc/copy                       "mod+c"
   :command.command-palette/toggle          "Показать палитру команд"
   :command.graph/export-as-html            "Экспорт публичных страниц графов в формате html"
   :command.graph/open                      "Выберите граф для открытия"
   :command.graph/remove                    "Удалить граф"
   :command.graph/add                       "Добавить граф"
   :command.graph/save                      "Сохранить текущий граф на диск"
   :command.graph/re-index                  "Переиндексировать текущий граф"
   :command.command/run                     "Выполнить команду git"
   :command.go/home                         "Домой"
   :command.go/all-graphs                   "Перейти ко всем графам"
   :command.go/whiteboards                  "Перейти к интерактивным доскам"
   :command.go/all-pages                    "Перейти ко всем страницам"
   :command.go/graph-view                   "Перейти к просмотру графа"
   :command.go/keyboard-shortcuts           "Перейти к горячим клавишам"
   :command.go/tomorrow                     "перейти к завтрашнему дню"
   :command.go/next-journal                 "Перейти к следующему журналу"
   :command.go/prev-journal                 "Перейти к предыдущему журналу"
   :command.go/flashcards                   "Переключить карточки"
   :command.ui/toggle-document-mode         "Переключить режим документа"
   :command.ui/toggle-settings              "Переключить параметры"
   :command.ui/toggle-right-sidebar         "Переключить правую панель"
   :command.ui/toggle-left-sidebar          "Переключить левую панель"
   :command.ui/toggle-help                  "Переключить помощь"
   :command.ui/toggle-theme                 "Переключение между темной/светлой темой"
   :command.ui/toggle-contents              "Переключить Контент на боковой панели"
             ;;  :ui/open-new-window                  "Открыть другое окно"
   :command.command/toggle-favorite         "Добавить или удалить из избранного"
   :command.editor/open-file-in-default-app "Открыть файл в программе по умолчанию"
   :command.editor/open-file-in-directory   "Открыть файл в родительском каталоге"
   :command.editor/copy-current-file        "Копировать текущий файл"
   :command.editor/copy-page-url            "Скопировать URL страницы"
   :command.ui/toggle-wide-mode             "Переключить широкоформатный режим"
   :command.ui/select-theme-color           "Выбрать доступные цвета темы"
   :command.ui/goto-plugins                 "Перейдите в панель управления расширениями"
   :command.ui/install-plugins-from-file    "Установить расширения из plugins.edn"
   :command.editor/toggle-open-blocks       "Переключить открытые блоки (свернуть или развернуть все блоки)"
   :command.ui/toggle-cards                 "Переключить карточки"
   :command.ui/clear-all-notifications      "Очистить все уведомления"
   :command.git/commit                      "Создать git-коммит с сообщением"
   :command.dev/show-block-data             "(Dev) Показать данные блока"
   :command.dev/show-block-ast              "(Dev) Показать AST блока"
   :command.dev/show-page-data              "(Dev) Показать данные страницы"
   :command.dev/show-page-ast               "(Dev) Показать AST страницы"})
