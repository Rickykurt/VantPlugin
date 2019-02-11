package main.java.com.vant.xml

import java.util.HashMap

object VantTagConstant {
    var TAG_CONSTANT = HashMap<String, HashMap<String, Array<String>>>()

    init {
        /* vant */
        val vanRowMap = HashMap<String, Array<String>>()
        vanRowMap["gutter"] = arrayOf("10")
        vanRowMap["type"] = arrayOf("flex")
        vanRowMap["justify"] = arrayOf("start", "center", "end", "space-between", "space-around")
        vanRowMap["align"] = arrayOf("top", "middle", "bottom")
        vanRowMap["tag"] = arrayOf("div")
        TAG_CONSTANT["van-row"] = vanRowMap

        val vanColMap = HashMap<String, Array<String>>()
        vanColMap["span"] = arrayOf("8")
        vanColMap["offset"] = arrayOf("6")
        vanColMap["tag"] = arrayOf("div")
        TAG_CONSTANT["van-col"] = vanColMap

        val vanBadgeGroupMap = HashMap<String, Array<String>>()
        vanBadgeGroupMap[":active-key"] = arrayOf("0")
        TAG_CONSTANT["van-badge-group"] = vanBadgeGroupMap

        val vanBadgeMap = HashMap<String, Array<String>>()
        vanBadgeMap["title"] = arrayOf()
        vanBadgeMap["info"] = arrayOf()
        vanBadgeMap["url"] = arrayOf()
        TAG_CONSTANT["van-badge"] = vanBadgeMap

        val vanButtonMap = HashMap<String, Array<String>>()
        vanButtonMap["type"] = arrayOf("default", "primary", "warning", "danger")
        vanButtonMap["size"] = arrayOf("normal", "large", "small", "mini")
        vanButtonMap["text"] = arrayOf()
        vanButtonMap["tag"] = arrayOf()
        vanButtonMap["native-type"] = arrayOf()
        vanButtonMap["plain"] = arrayOf()
        vanButtonMap["disabled"] = arrayOf()
        vanButtonMap["loading"] = arrayOf()
        vanButtonMap["block"] = arrayOf()
        vanButtonMap[":plain"] = arrayOf("true", "false")
        vanButtonMap[":disabled"] = arrayOf("true", "false")
        vanButtonMap[":loading"] = arrayOf("true", "false")
        vanButtonMap[":block"] = arrayOf("true", "false")
        vanButtonMap["@click"] = arrayOf()
        TAG_CONSTANT["van-button"] = vanButtonMap

        val vanCellGroupMap = HashMap<String, Array<String>>()
        vanCellGroupMap["border"] = arrayOf()
        TAG_CONSTANT["van-cell-group"] = vanCellGroupMap

        val vanCellMap = HashMap<String, Array<String>>()
        vanCellMap["icon"] = arrayOf()
        vanCellMap["title"] = arrayOf()
        vanCellMap["value"] = arrayOf()
        vanCellMap["label"] = arrayOf()
        vanCellMap["border"] = arrayOf()
        vanCellMap["center"] = arrayOf()
        vanCellMap[":border"] = arrayOf("true", "false")
        vanCellMap[":center"] = arrayOf("true", "false")
        vanCellMap["url"] = arrayOf()
        vanCellMap["to"] = arrayOf()
        vanCellMap["replace"] = arrayOf()
        vanCellMap["clickable"] = arrayOf()
        vanCellMap["is-link"] = arrayOf()
        vanCellMap["required"] = arrayOf()
        vanCellMap[":clickable"] = arrayOf("true", "false")
        vanCellMap[":is-link"] = arrayOf("true", "false")
        vanCellMap[":required"] = arrayOf("true", "false")
        vanCellMap["arrow-direction"] = arrayOf("left", "up", "down")
        vanCellMap["slot"] = arrayOf("right-icon")
        vanCellMap["@click"] = arrayOf()
        TAG_CONSTANT["van-cell"] = vanCellMap

        val vanCircleMap = HashMap<String, Array<String>>()
        vanCircleMap["v-model"] = arrayOf()
        vanCircleMap[":rate"] = arrayOf("100")
        vanCircleMap["size"] = arrayOf("100px")
        vanCircleMap["color"] = arrayOf("#38f")
        vanCircleMap["layer-color"] = arrayOf("#fff")
        vanCircleMap["fill"] = arrayOf("none")
        vanCircleMap[":speed"] = arrayOf("100")
        vanCircleMap[":text"] = arrayOf("text")
        vanCircleMap[":stroke-width"] = arrayOf("40")
        vanCircleMap[":clockwise"] = arrayOf("true", "false")
        TAG_CONSTANT["van-circle"] = vanCircleMap

        val vanCollapseMap = HashMap<String, Array<String>>()
        vanCollapseMap["v-model"] = arrayOf()
        vanCollapseMap["accordion"] = arrayOf()
        vanCollapseMap["@change"] = arrayOf()
        TAG_CONSTANT["van-collapse"] = vanCollapseMap

        val vanCollapseItemMap = HashMap<String, Array<String>>()
        vanCollapseItemMap["name"] = arrayOf("1")
        vanCollapseItemMap["title"] = arrayOf()
        TAG_CONSTANT["van-collapse-item"] = vanCollapseItemMap

        val vanIconMap = HashMap<String, Array<String>>()
        vanIconMap["name"] = arrayOf()
        vanIconMap["info"] = arrayOf()
        vanIconMap["color"] = arrayOf()
        vanIconMap["size"] = arrayOf("20px")
        vanIconMap["@click"] = arrayOf()
        TAG_CONSTANT["van-icon"] = vanIconMap

        val vanListMap = HashMap<String, Array<String>>()
        vanListMap["v-model"] = arrayOf()
        vanListMap[":loading"] = arrayOf("true", "false")
        vanListMap[":finished"] = arrayOf("true", "false")
        vanListMap[":offset"] = arrayOf("300")
        vanListMap["loading-text"] = arrayOf("加载中...")
        vanListMap[":immediate-check"] = arrayOf("true", "false")
        vanListMap["@load"] = arrayOf()
        TAG_CONSTANT["van-list"] = vanListMap

        val vanLoadingMap = HashMap<String, Array<String>>()
        vanLoadingMap["color"] = arrayOf("black", "white")
        vanLoadingMap["type"] = arrayOf("circular", "spinner")
        vanLoadingMap["size"] = arrayOf("30px")
        TAG_CONSTANT["van-loading"] = vanLoadingMap

        val vanNavBarMap = HashMap<String, Array<String>>()
        vanNavBarMap["title"] = arrayOf()
        vanNavBarMap["left-text"] = arrayOf()
        vanNavBarMap["right-text"] = arrayOf()
        vanNavBarMap[":left-arrow"] = arrayOf("true", "false")
        vanNavBarMap["left-arrow"] = arrayOf()
        vanNavBarMap[":fixed"] = arrayOf("true", "false")
        vanNavBarMap["fixed"] = arrayOf()
        vanNavBarMap["z-index"] = arrayOf("1")
        vanNavBarMap["@click-left"] = arrayOf()
        vanNavBarMap["@click-right"] = arrayOf()
        TAG_CONSTANT["van-nav-bar"] = vanNavBarMap

        val vanNoticeBarMap = HashMap<String, Array<String>>()
        vanNoticeBarMap["text"] = arrayOf()
        vanNoticeBarMap["mode"] = arrayOf("closeable", "link")
        vanNoticeBarMap["delay"] = arrayOf("1")
        vanNoticeBarMap["speed"] = arrayOf("50")
        vanNoticeBarMap[":scrollable"] = arrayOf("true", "false")
        vanNoticeBarMap["scrollable"] = arrayOf()
        vanNoticeBarMap["left-icon"] = arrayOf()
        vanNoticeBarMap["color"] = arrayOf("#f60")
        vanNoticeBarMap["background"] = arrayOf("#fff7cc")
        vanNoticeBarMap["@click"] = arrayOf()
        TAG_CONSTANT["van-notice-bar"] = vanNoticeBarMap

        val vanPaginationMap = HashMap<String, Array<String>>()
        vanPaginationMap["v-model"] = arrayOf()
        vanPaginationMap["mode"] = arrayOf("multi", "simple")
        vanPaginationMap[":total-items"] = arrayOf("10")
        vanPaginationMap[":page-count"] = arrayOf("10")
        vanPaginationMap[":items-per-page"] = arrayOf("10")
        vanPaginationMap["prev-text"] = arrayOf("上一页")
        vanPaginationMap["next-text"] = arrayOf("下一页")
        vanPaginationMap[":show-page-size"] = arrayOf("5")
        vanPaginationMap["force-ellipses"] = arrayOf()
        vanPaginationMap["@change"] = arrayOf()
        TAG_CONSTANT["van-pagination"] = vanPaginationMap

        val vanPanelMap = HashMap<String, Array<String>>()
        vanPanelMap["title"] = arrayOf()
        vanPanelMap["desc"] = arrayOf()
        vanPanelMap["status"] = arrayOf()
        TAG_CONSTANT["van-panel"] = vanPanelMap

        val vanPopupMap = HashMap<String, Array<String>>()
        vanPopupMap["v-model"] = arrayOf("true", "false")
        vanPopupMap[":overlay"] = arrayOf("true", "false")
        vanPopupMap[":lock-scroll"] = arrayOf("true", "false")
        vanPopupMap["position"] = arrayOf("top", "bottom", "right", "left")
        vanPopupMap["overlay-class"] = arrayOf()
        vanPopupMap["overlay-style"] = arrayOf("{height:200, marginTop:10}")
        vanPopupMap[":close-on-click-overlay"] = arrayOf("true", "false")
        vanPopupMap["transition"] = arrayOf("popup-slide")
        vanPopupMap[":lazy-render"] = arrayOf("true", "false")
        vanPopupMap["get-container"] = arrayOf("() => HTMLElement")
        vanPopupMap["@click-overlay"] = arrayOf()
        TAG_CONSTANT["van-popup"] = vanPopupMap


        val vanProgressMap = HashMap<String, Array<String>>()
        vanProgressMap[":inactive"] = arrayOf("true", "false")
        vanProgressMap[":percentage"] = arrayOf("75")
        vanProgressMap[":show-pivot"] = arrayOf("true", "false")
        vanProgressMap["color"] = arrayOf("#38f", "linear-gradient(to right, #be99ff, #7232dd)")
        vanProgressMap["text-color"] = arrayOf("#fff")
        vanProgressMap["pivot-text"] = arrayOf("purple")
        vanProgressMap["pivot-color"] = arrayOf("#7232dd")
        TAG_CONSTANT["van-progress"] = vanProgressMap


        val vanStepsMap = HashMap<String, Array<String>>()
        vanStepsMap[":active"] = arrayOf("1")
        vanStepsMap["icon"] = arrayOf("logistics")
        vanStepsMap["title"] = arrayOf()
        vanStepsMap["description"] = arrayOf("")
        vanStepsMap["icon-class"] = arrayOf("")
        vanStepsMap["direction"] = arrayOf("horizontal", "vertical")
        vanStepsMap["active-color"] = arrayOf("#06bf04")
        TAG_CONSTANT["van-steps"] = vanStepsMap

        val vanStepMap = HashMap<String, Array<String>>()
        TAG_CONSTANT["van-step"] = vanStepMap

        val vanSwipeMap = HashMap<String, Array<String>>()
        vanSwipeMap[":autoplay"] = arrayOf("3000")
        vanSwipeMap[":duration"] = arrayOf("500")
        vanSwipeMap[":loop"] = arrayOf("true", "false")
        vanSwipeMap[":vertical"] = arrayOf("true", "false")
        vanSwipeMap[":touchable"] = arrayOf("true", "false")
        vanSwipeMap[":show-indicators"] = arrayOf("true", "false")
        vanSwipeMap[":initial-swipe"] = arrayOf("0")
        vanSwipeMap["@change"] = arrayOf()
        TAG_CONSTANT["van-swipe"] = vanSwipeMap

        val vanSwipeItemMap = HashMap<String, Array<String>>()
        TAG_CONSTANT["van-swipe-item"] = vanSwipeItemMap

        val vanTabsMap = HashMap<String, Array<String>>()
        vanTabsMap["v-model"] = arrayOf("0")
        vanTabsMap["type"] = arrayOf("line", "card")
        vanTabsMap[":duration"] = arrayOf("0.2")
        vanTabsMap["line-width"] = arrayOf()
        vanTabsMap["swipe-threshold"] = arrayOf("4")
        vanTabsMap["sticky"] = arrayOf("true", "false")
        vanTabsMap[":offset-top"] = arrayOf("0")
        vanTabsMap["swipeable"] = arrayOf("true", "false")
        vanTabsMap["@click"] = arrayOf()
        vanTabsMap["@disabled"] = arrayOf()
        vanTabsMap["@change"] = arrayOf()
        TAG_CONSTANT["van-tabs"] = vanTabsMap

        val vanTabMap = HashMap<String, Array<String>>()
        vanTabsMap["title"] = arrayOf()
        vanTabsMap[":disabled"] = arrayOf("true", "false")
        TAG_CONSTANT["van-tab"] = vanTabMap

        val vanTabBarMap = HashMap<String, Array<String>>()
        vanTabBarMap["v-model"] = arrayOf()
        vanTabBarMap[":fixed"] = arrayOf("true", "false")
        vanTabBarMap["z-index"] = arrayOf("1")
        vanTabBarMap["@change"] = arrayOf()
        TAG_CONSTANT["van-tabbar"] = vanTabBarMap

        val vanTabBarItem = HashMap<String, Array<String>>()
        vanTabBarItem["icon"] = arrayOf()
        vanTabBarItem[":dot"] = arrayOf("true", "false")
        vanTabBarItem["info"] = arrayOf()
        vanTabBarItem["url"] = arrayOf()
        vanTabBarItem["to"] = arrayOf()
        vanTabBarItem[":replace"] = arrayOf("true", "false")
        TAG_CONSTANT["van-tabbar-item"] = vanTabBarItem

        val vanTagMap = HashMap<String, Array<String>>()
        vanTagMap["type"] = arrayOf("primary", "success", "danger")
        vanTagMap[":plain"] = arrayOf("true", "false")
        vanTagMap[":mark"] = arrayOf("true", "false")
        TAG_CONSTANT["van-tag"] = vanTagMap


        val vanCheckboxMap = HashMap<String, Array<String>>()
        vanCheckboxMap["name"] = arrayOf()
        vanCheckboxMap["v-model"] = arrayOf("true", "false")
        vanCheckboxMap[":disabled"] = arrayOf("true", "false")
        vanCheckboxMap[":label-disabled"] = arrayOf("true", "false")
        vanCheckboxMap["label-position"] = arrayOf("right", "left")
        vanCheckboxMap["shape"] = arrayOf("round", "square")
        vanCheckboxMap["@change"] = arrayOf()
        TAG_CONSTANT["van-checkbox"] = vanCheckboxMap

        val vanCheckboxGroupMap = HashMap<String, Array<String>>()
        vanCheckboxGroupMap["v-model"] = arrayOf("['a', 'b']")
        vanCheckboxGroupMap[":disabled"] = arrayOf("true", "false")
        vanCheckboxGroupMap[":max"] = arrayOf("0")
        TAG_CONSTANT["van-checkbox-group"] = vanCheckboxGroupMap

        val vanFieldMap = HashMap<String, Array<String>>()
        vanFieldMap["label"] = arrayOf()
        vanFieldMap["value"] = arrayOf()
        vanFieldMap["type"] = arrayOf("text", "password", "number", "tel", "textarea")
        vanFieldMap[":border"] = arrayOf("true", "false")
        vanFieldMap[":disabled"] = arrayOf("true", "false")
        vanFieldMap[":readonly"] = arrayOf("true", "false")
        vanFieldMap[":clearable"] = arrayOf("true", "false")
        vanFieldMap[":required"] = arrayOf("true", "false")
        vanFieldMap[":is-link"] = arrayOf("true", "false")
        vanFieldMap[":error"] = arrayOf("true", "false")
        vanFieldMap["error-message"] = arrayOf()
        vanFieldMap["label-align"] = arrayOf("left", "center", "right")
        vanFieldMap["input-align"] = arrayOf("left", "center", "right")
        vanFieldMap["autosize"] = arrayOf("medium", "small", "mini")
        vanFieldMap["icon"] = arrayOf("true", "false", "{ maxHeight: 100, minHeight: 50 }")
        vanFieldMap["left-icon"] = arrayOf()
        vanFieldMap["@click-icon"] = arrayOf()
        vanFieldMap["@blur"] = arrayOf()
        TAG_CONSTANT["van-field"] = vanFieldMap

        val vanNumberKeyboardMap = HashMap<String, Array<String>>()
        vanNumberKeyboardMap[":show"] = arrayOf("true", "false")
        vanNumberKeyboardMap["theme"] = arrayOf("default", "custom")
        vanNumberKeyboardMap["title"] = arrayOf()
        vanNumberKeyboardMap[":transition"] = arrayOf("true", "false")
        vanNumberKeyboardMap[":z-index"] = arrayOf("100")
        vanNumberKeyboardMap["extra-key"] = arrayOf()
        vanNumberKeyboardMap["close-button-text"] = arrayOf()
        vanNumberKeyboardMap[":show-delete-key"] = arrayOf("true", "false")
        vanNumberKeyboardMap[":hide-on-click-outside"] = arrayOf("true", "false")
        vanNumberKeyboardMap["@input"] = arrayOf()
        vanNumberKeyboardMap["@delete"] = arrayOf()
        vanNumberKeyboardMap["@close"] = arrayOf()
        vanNumberKeyboardMap["@blur"] = arrayOf()
        vanNumberKeyboardMap["@show"] = arrayOf()
        vanNumberKeyboardMap["@hide"] = arrayOf()
        TAG_CONSTANT["van-number-keyboard"] = vanNumberKeyboardMap

        val vanPasswordInputMap = HashMap<String, Array<String>>()
        vanPasswordInputMap[":value"] = arrayOf()
        vanPasswordInputMap[":length"] = arrayOf("6")
        vanPasswordInputMap["info"] = arrayOf()
        vanPasswordInputMap["error-info"] = arrayOf()
        vanPasswordInputMap["@focus"] = arrayOf()
        TAG_CONSTANT["van-password-input"] = vanPasswordInputMap

        val vanRadioGroupMap = HashMap<String, Array<String>>()
        vanRadioGroupMap["v-model"] = arrayOf()
        vanRadioGroupMap[":disabled"] = arrayOf("true", "false")
        vanRadioGroupMap["@change"] = arrayOf()
        TAG_CONSTANT["van-radio-group"] = vanRadioGroupMap

        val vanRadioMap = HashMap<String, Array<String>>()
        vanRadioMap["name"] = arrayOf()
        vanRadioMap[":disabled"] = arrayOf("true", "false")
        vanRadioMap[":label-disabled"] = arrayOf("true", "false")
        vanRadioMap["label-position"] = arrayOf("right", "left")
        TAG_CONSTANT["van-radio"] = vanRadioMap

        val vanRateMap = HashMap<String, Array<String>>()
        vanRateMap["v-model"] = arrayOf("3")
        vanRateMap[":count"] = arrayOf("5")
        vanRateMap[":size"] = arrayOf("20")
        vanRateMap["color"] = arrayOf("#ffd21e")
        vanRateMap["void-color"] = arrayOf("#bdbdbd")
        vanRateMap["disabled-color"] = arrayOf("#bdbdbd")
        vanRateMap[":disabled"] = arrayOf("true", "false")
        vanRateMap["@change"] = arrayOf()
        TAG_CONSTANT["van-rate"] = vanRateMap

        val vanSearchMap = HashMap<String, Array<String>>()
        vanSearchMap["background"] = arrayOf("#f2f2f2")
        vanSearchMap[":show-action"] = arrayOf("true", "false")
        vanSearchMap["@cancel"] = arrayOf()
        vanSearchMap["@search"] = arrayOf()
        vanSearchMap["@focus"] = arrayOf()
        vanSearchMap["@blur"] = arrayOf()
        vanSearchMap["@keypress"] = arrayOf()
        TAG_CONSTANT["van-search"] = vanSearchMap

        val vanSliderMap = HashMap<String, Array<String>>()
        vanSliderMap["v-model"] = arrayOf("0")
        vanSliderMap[":disabled"] = arrayOf("true", "false")
        vanSliderMap[":max"] = arrayOf("100")
        vanSliderMap[":min"] = arrayOf("0")
        vanSliderMap[":step"] = arrayOf("1")
        vanSliderMap[":bar-height"] = arrayOf("2px")
        vanSliderMap["@change"] = arrayOf()
        TAG_CONSTANT["van-slider"] = vanSliderMap

        val vanStepperMap = HashMap<String, Array<String>>()
        vanStepperMap["v-model"] = arrayOf("1")
        vanStepperMap[":min"] = arrayOf("1")
        vanStepperMap[":max"] = arrayOf("10")
        vanStepperMap[":step"] = arrayOf("1")
        vanStepperMap[":integer"] = arrayOf("true", "false")
        vanStepperMap[":disabled"] = arrayOf("true", "false")
        vanStepperMap[":disable-input"] = arrayOf("true", "false")
        vanStepperMap["@change"] = arrayOf()
        vanStepperMap["@overlimit"] = arrayOf()
        vanStepperMap["@plus"] = arrayOf()
        vanStepperMap["@minus"] = arrayOf()
        vanStepperMap["@blur"] = arrayOf()
        TAG_CONSTANT["van-stepper"] = vanStepperMap

        val vanSwitchMap = HashMap<String, Array<String>>()
        vanSwitchMap["v-model"] = arrayOf("true", "false")
        vanSwitchMap[":loading"] = arrayOf("true", "false")
        vanSwitchMap[":disabled"] = arrayOf("true", "false")
        vanSwitchMap["size"] = arrayOf("30px")
        vanSwitchMap["@change"] = arrayOf()
        TAG_CONSTANT["van-switch"] = vanSwitchMap

        val vanUploaderMap = HashMap<String, Array<String>>()
        vanUploaderMap["result-type"] = arrayOf("dataUrl", "test")
        vanUploaderMap["accept"] = arrayOf("image/*")
        vanUploaderMap[":disabled"] = arrayOf("true", "false")
        vanUploaderMap["before-read"] = arrayOf("Function()")
        vanUploaderMap["after-read"] = arrayOf("Function(file, content)")
        vanUploaderMap["max-size"] = arrayOf("1000000")
        vanUploaderMap["@oversize"] = arrayOf()
        TAG_CONSTANT["van-uploader"] = vanUploaderMap

        val vanActionSheetMap = HashMap<String, Array<String>>()
        vanActionSheetMap["actions"] = arrayOf("[{name: 'title', subname: 'subtitle', className: 'className for the option', loading: true, disabled:false}]")
        vanActionSheetMap["title"] = arrayOf()
        vanActionSheetMap["cancel-text"] = arrayOf()
        vanActionSheetMap[":overlay"] = arrayOf("true", "false")
        vanActionSheetMap[":close-on-click-overlay"] = arrayOf("true", "false")
        vanActionSheetMap[":lazy-render"] = arrayOf("true", "false")
        vanActionSheetMap["get-container"] = arrayOf("() => HTMLElement")
        vanActionSheetMap["@select"] = arrayOf("Function(item)")
        vanActionSheetMap["@cancel"] = arrayOf()
        TAG_CONSTANT["van-actionsheet"] = vanActionSheetMap

        val vanDateTimePickerMap = HashMap<String, Array<String>>()
        vanDateTimePickerMap["v-model"] = arrayOf("new Date()")
        vanDateTimePickerMap["type"] = arrayOf("datetime", "date", "time", "year-month")
        vanDateTimePickerMap[":min-date"] = arrayOf("new Date()")
        vanDateTimePickerMap[":max-date"] = arrayOf("new Date()")
        vanDateTimePickerMap[":min-hour"] = arrayOf("0")
        vanDateTimePickerMap[":max-hour"] = arrayOf("23")
        vanDateTimePickerMap[":min-minute"] = arrayOf("0")
        vanDateTimePickerMap[":max-minute"] = arrayOf("59")
        vanDateTimePickerMap[":formatter"] = arrayOf("(type, value) => value")
        vanDateTimePickerMap["title"] = arrayOf()
        vanDateTimePickerMap[":loading"] = arrayOf("true", "false")
        vanDateTimePickerMap[":item-height"] = arrayOf("44")
        vanDateTimePickerMap["confirm-button-text"] = arrayOf()
        vanDateTimePickerMap["cancel-button-text"] = arrayOf()
        vanDateTimePickerMap[":visible-item-count"] = arrayOf("5")
        vanDateTimePickerMap["@change"] = arrayOf("Function(picker)")
        vanDateTimePickerMap["@confirm"] = arrayOf("Function(value)")
        vanDateTimePickerMap["@cancel"] = arrayOf()
        TAG_CONSTANT["van-datetime-picker"] = vanDateTimePickerMap

        val vanDialogMap = HashMap<String, Array<String>>()
        vanDialogMap["v-model"] = arrayOf("true", "false")
        vanDialogMap["title"] = arrayOf()
        vanDialogMap["message"] = arrayOf()
        vanDialogMap[":show-confirm-button"] = arrayOf("true", "false")
        vanDialogMap[":show-cancel-button"] = arrayOf("true", "false")
        vanDialogMap["confirm-button-text"] = arrayOf()
        vanDialogMap["cancel-button-text"] = arrayOf()
        vanDialogMap[":overlay"] = arrayOf("true", "false")
        vanDialogMap[":close-on-click-overlay"] = arrayOf("true", "false")
        vanDialogMap[":lock-scroll"] = arrayOf("true", "false")
        vanDialogMap[":before-close"] = arrayOf("(action: string, done: function) => void")
        vanDialogMap["get-container"] = arrayOf("() => HTMLElement")
        TAG_CONSTANT["van-dialog"] = vanDialogMap

        val vanPickerMap = HashMap<String, Array<String>>()
        vanPickerMap["columns"] = arrayOf("['Delaware', 'Florida', 'Georqia', 'Indiana', 'Maine']")
        vanPickerMap[":show-toolbar"] = arrayOf("true", "false")
        vanPickerMap["title"] = arrayOf()
        vanPickerMap[":loading"] = arrayOf("true", "false")
        vanPickerMap["value-key"] = arrayOf()
        vanPickerMap[":item-height"] = arrayOf("44")
        vanPickerMap["confirm-button-text"] = arrayOf()
        vanPickerMap["cancel-button-text"] = arrayOf()
        vanPickerMap[":visible-item-count"] = arrayOf("5")
        vanPickerMap["@confirm"] = arrayOf("Function(value, index)")
        vanPickerMap["@cancel"] = arrayOf("Function(value, index)")
        vanPickerMap["@change"] = arrayOf("Function(picker, value, index)")
        TAG_CONSTANT["van-picker"] = vanPickerMap

        val vanPullRefreshMap = HashMap<String, Array<String>>()
        vanPullRefreshMap["v-model"] = arrayOf("true", "false")
        vanPullRefreshMap["pulling-text"] = arrayOf("Pull to refresh...")
        vanPullRefreshMap["loosing-text"] = arrayOf("Loose to refresh...")
        vanPullRefreshMap["loading-text"] = arrayOf("Loading...")
        vanPullRefreshMap[":animation-duration"] = arrayOf("300")
        vanPullRefreshMap[":head-height"] = arrayOf("50")
        vanPullRefreshMap[":disabled"] = arrayOf("true", "false")
        vanPullRefreshMap["@refresh"] = arrayOf()
        TAG_CONSTANT["van-pull-refresh"] = vanPullRefreshMap

        val vanSwipeCellMap = HashMap<String, Array<String>>()
        vanSwipeCellMap[":left-width"] = arrayOf("0")
        vanSwipeCellMap[":right-width"] = arrayOf("0")
        vanSwipeCellMap[":on-close"] = arrayOf("Function(clickPosition, instance)")
        TAG_CONSTANT["van-swipe-cell"] = vanSwipeCellMap

        val vanSwitchCellMap = HashMap<String, Array<String>>()
        vanSwitchCellMap["v-model"] = arrayOf("true", "false")
        vanSwitchCellMap["title"] = arrayOf()
        vanSwitchCellMap[":loading"] = arrayOf("true", "false")
        vanSwitchCellMap[":disabled"] = arrayOf("true", "false")
        vanSwitchCellMap[":size"] = arrayOf("26px")
        vanSwitchCellMap["@change"] = arrayOf("Function(checked)")
        TAG_CONSTANT["van-switch-cell"] = vanSwitchCellMap

        val vanTreeSelectMap = HashMap<String, Array<String>>()
        vanTreeSelectMap[":items"] = arrayOf("[{text: 'All Cities',children: [{text: 'Washington',id: 1002},{text: 'Baltimore',id: 1001}]}]")
        vanTreeSelectMap[":main-active-index"] = arrayOf("0")
        vanTreeSelectMap[":active-id"] = arrayOf("0")
        vanTreeSelectMap["@navclick"] = arrayOf("Function(index)")
        vanTreeSelectMap["@itemclick"] = arrayOf("Function(data)")
        TAG_CONSTANT["van-tree-select"] = vanTreeSelectMap

        val vanAddressEditMap = HashMap<String, Array<String>>()
        vanAddressEditMap["area-list"] = arrayOf("{province_list: {110000: 'Beijing',330000: 'Zhejiang Province'},city_list: {110100: 'Beijing City',330100: 'Hangzhou',},county_list: {110101: 'Dongcheng District',110102: 'Xicheng District',110105: 'Chaoyang District',110106: 'Fengtai District'330105: 'Gongshu District',330106: 'Xihu District'}}")
        vanAddressEditMap["address-info"] = arrayOf("{id:1,name:'1',tel:'1',province:'1',city:'1',county:'1',addressDetail:'1',areaCode:'1',postalCode:'1',isDefault:true}")
        vanAddressEditMap["search-result"] = arrayOf("[{name:'1',address:'1'}]")
        vanAddressEditMap["show-postal"] = arrayOf("true", "false")
        vanAddressEditMap["show-delete"] = arrayOf("true", "false")
        vanAddressEditMap["show-set-default"] = arrayOf("true", "false")
        vanAddressEditMap["show-search-result"] = arrayOf("true", "false")
        vanAddressEditMap["save-button-text"] = arrayOf()
        vanAddressEditMap["delete-button-text"] = arrayOf()
        vanAddressEditMap["is-saving"] = arrayOf("true", "false")
        vanAddressEditMap["is-deleting"] = arrayOf("true", "false")
        vanAddressEditMap[":tel-validator"] = arrayOf("(tel: string) => boolean")
        vanAddressEditMap["@save"] = arrayOf("Function(content)")
        vanAddressEditMap["@focus"] = arrayOf("Function(key)")
        vanAddressEditMap["@delete"] = arrayOf("Function(content)")
        vanAddressEditMap["@cancel-delete"] = arrayOf("Function(content)")
        vanAddressEditMap["@select-search"] = arrayOf("Function(value)")
        vanAddressEditMap["@change-area"] = arrayOf("Function(values)")
        vanAddressEditMap["@change-detail"] = arrayOf("Function(value)")
        TAG_CONSTANT["van-address-edit"] = vanAddressEditMap

        val vanAddressListMap = HashMap<String, Array<String>>()
        vanAddressListMap["v-model"] = arrayOf()
        vanAddressListMap["list"] = arrayOf("[{id: '1',name: 'John Snow',tel: '13000000000',address: 'Somewhere'},{id: '2',name: 'Ned Stark',tel: '1310000000',address: 'Somewhere'}]")
        vanAddressListMap["add-button-text"] = arrayOf()
        vanAddressListMap["@add"] = arrayOf()
        vanAddressListMap["@edit"] = arrayOf("Function(item, index)")
        vanAddressListMap["@select"] = arrayOf("Function(item, index)")
        TAG_CONSTANT["van-address-list"] = vanAddressListMap

        val vanAreaMap = HashMap<String, Array<String>>()
        vanAreaMap[":value"] = arrayOf()
        vanAreaMap["title"] = arrayOf()
        vanAreaMap[":area-list"] = arrayOf("{province_list: {110000: 'Beijing',330000: 'Zhejiang Province'},city_list: {110100: 'Beijing City',330100: 'Hangzhou',},county_list: {110101: 'Dongcheng District',110102: 'Xicheng District',110105: 'Chaoyang District',110106: 'Fengtai District'330105: 'Gongshu District',330106: 'Xihu District'}}")
        vanAreaMap[":columns-num"] = arrayOf("3")
        vanAreaMap[":loading"] = arrayOf("true", "false")
        vanAreaMap[":item-height"] = arrayOf("44")
        vanAreaMap["visible-item-count"] = arrayOf("5")
        vanAreaMap["@confirm"] = arrayOf("Function([{code: '330000',name: 'Zhejiang Province'},{code: '330100',name: 'Hangzhou'},{code: '330105',name: 'Xihu District'}])")
        vanAreaMap["@cancel"] = arrayOf()
        vanAreaMap["@change"] = arrayOf("Function(picker)")
        TAG_CONSTANT["van-area"] = vanAreaMap

        val vanCardMap = HashMap<String, Array<String>>()
        vanCardMap[":thumb"] = arrayOf()
        vanCardMap[":title"] = arrayOf()
        vanCardMap[":desc"] = arrayOf()
        vanCardMap[":num"] = arrayOf("1")
        vanCardMap[":price"] = arrayOf("0.01")
        vanCardMap[":centered"] = arrayOf("true", "false")
        vanCardMap[":currency"] = arrayOf("¥")
        TAG_CONSTANT["van-card"] = vanCardMap

        val vanContactCardMap = HashMap<String, Array<String>>()
        vanContactCardMap[":type"] = arrayOf("add", "edit")
        vanContactCardMap[":name"] = arrayOf()
        vanContactCardMap[":tel"] = arrayOf()
        vanContactCardMap[":add-text"] = arrayOf()
        TAG_CONSTANT["van-contact-card"] = vanContactCardMap

        val vanContactListMap = HashMap<String, Array<String>>()
        vanContactListMap["v-model"] = arrayOf()
        vanContactListMap[":list"] = arrayOf("[{name: 'John Snow',tel: '13000000000',id: 0}]")
        vanContactListMap["add-text"] = arrayOf()
        vanContactListMap["@add"] = arrayOf()
        vanContactListMap["@edit"] = arrayOf("Function(item, index)")
        vanContactListMap["@select"] = arrayOf("Function(item, index)")
        TAG_CONSTANT["van-contact-list"] = vanContactListMap

        val vanContactEdit = HashMap<String, Array<String>>()
        vanContactEdit[":contact-info"] = arrayOf("{name: 'John Snow',tel: '13000000000',id: 0}")
        vanContactEdit[":is-edit"] = arrayOf("true", "false")
        vanContactEdit[":is-saving"] = arrayOf("true", "false")
        vanContactEdit[":is-deleting"] = arrayOf("true", "false")
        vanContactEdit[":tel-validator"] = arrayOf("(tel: string) => boolean")
        vanContactEdit["@save"] = arrayOf("Function(content)")
        vanContactEdit["@delete"] = arrayOf("Function(content)")
        TAG_CONSTANT["van-contact-edit"] = vanContactEdit

        val vanCouponCellMap = HashMap<String, Array<String>>()
        vanCouponCellMap["title"] = arrayOf()
        vanCouponCellMap[":chosen-coupon"] = arrayOf("-1")
        vanCouponCellMap[":coupons"] = arrayOf("[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]")
        vanCouponCellMap[":editable"] = arrayOf("true", "false")
        TAG_CONSTANT["van-coupon-cell"] = vanCouponCellMap

        val vanCouponListMap = HashMap<String, Array<String>>()
        vanCouponListMap["v-model"] = arrayOf()
        vanCouponListMap[":chosen-coupon"] = arrayOf("-1")
        vanCouponListMap[":coupons"] = arrayOf("[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]")
        vanCouponListMap[":disabled-coupons"] = arrayOf("[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]")
        vanCouponListMap[":exchange-button-text"] = arrayOf()
        vanCouponListMap[":exchange-button-loading"] = arrayOf("true", "false")
        vanCouponListMap[":exchange-button-disabled"] = arrayOf("true", "false")
        vanCouponListMap[":exchange-min-length"] = arrayOf("1")
        vanCouponListMap[":displayed-coupon-index"] = arrayOf()
        vanCouponListMap["close-button-text"] = arrayOf()
        vanCouponListMap[":show-close-button"] = arrayOf("true", "false")
        vanCouponListMap["disabled-list-title"] = arrayOf()
        vanCouponListMap["input-placeholder"] = arrayOf()
        vanCouponListMap[":show-exchange-bar"] = arrayOf("true", "false")
        vanCouponListMap["@change"] = arrayOf("Function(index)")
        vanCouponListMap["@exchange"] = arrayOf("Function(code)")
        TAG_CONSTANT["van-coupon-list"] = vanCouponListMap

        val vanGoodsActionMap = HashMap<String, Array<String>>()
        TAG_CONSTANT["van-goods-action"] = vanGoodsActionMap

        val vanGoodsActionBigBtnMap = HashMap<String, Array<String>>()
        vanGoodsActionBigBtnMap["text"] = arrayOf()
        vanGoodsActionBigBtnMap["primary"] = arrayOf("true", "false")
        vanGoodsActionBigBtnMap["url"] = arrayOf()
        vanGoodsActionBigBtnMap["to"] = arrayOf()
        vanGoodsActionBigBtnMap["replace"] = arrayOf("true", "false")
        TAG_CONSTANT["van-goods-action-big-btn"] = vanGoodsActionBigBtnMap

        val vanGoodsActionMiniBtnMap = HashMap<String, Array<String>>()
        vanGoodsActionMiniBtnMap["text"] = arrayOf()
        vanGoodsActionMiniBtnMap["icon"] = arrayOf()
        vanGoodsActionMiniBtnMap["icon-class"] = arrayOf()
        vanGoodsActionMiniBtnMap["info"] = arrayOf()
        vanGoodsActionMiniBtnMap["url"] = arrayOf()
        vanGoodsActionMiniBtnMap["to"] = arrayOf()
        vanGoodsActionMiniBtnMap["replace"] = arrayOf("true", "false")
        TAG_CONSTANT["van-goods-action-mini-btn"] = vanGoodsActionMiniBtnMap

        val vanSubmitBarMap = HashMap<String, Array<String>>()
        vanSubmitBarMap[":price"] = arrayOf("0.00")
        vanSubmitBarMap["label"] = arrayOf()
        vanSubmitBarMap["button-text"] = arrayOf()
        vanSubmitBarMap[":button-type"] = arrayOf("danger")
        vanSubmitBarMap["tip"] = arrayOf()
        vanSubmitBarMap[":disabled"] = arrayOf("true", "false")
        vanSubmitBarMap["loading"] = arrayOf("true", "false")
        vanSubmitBarMap[":currency"] = arrayOf("¥")
        vanSubmitBarMap["@submit"] = arrayOf()
        TAG_CONSTANT["van-submit-bar"] = vanSubmitBarMap

        val vanSkuMap = HashMap<String, Array<String>>()
        vanSkuMap["v-model"] = arrayOf("true", "false")
        vanSkuMap[":sku"] = arrayOf()
        vanSkuMap[":goods"] = arrayOf("{title: 'Title',picture: 'https://img.yzcdn.cn/1.jpg'}")
        vanSkuMap[":goods-id"] = arrayOf()
        vanSkuMap[":hide-stock"] = arrayOf("true", "false")
        vanSkuMap[":show-add-cart-btn"] = arrayOf("true", "false")
        vanSkuMap[":quota"] = arrayOf("0")
        vanSkuMap[":quota-used"] = arrayOf("0")
        vanSkuMap[":reset-stepper-on-hide"] = arrayOf("true", "false")
        vanSkuMap[":reset-selected-sku-on-hide"] = arrayOf("true", "false")
        vanSkuMap[":disable-stepper-input"] = arrayOf("true", "false")
        vanSkuMap[":close-on-click-overlay"] = arrayOf("true", "false")
        vanSkuMap["stepper-title"] = arrayOf()
        vanSkuMap[":custom-stepper-config"] = arrayOf()
        vanSkuMap[":message-config"] = arrayOf()
        vanSkuMap[":get-container"] = arrayOf("() => HTMLElement")
        vanSkuMap["@add-cart"] = arrayOf("Function(skuData:Object)")
        vanSkuMap["@buy-clicked"] = arrayOf("Function(skuData:Object)")
        vanSkuMap["@stepper-change"] = arrayOf("Function(value:Number)")
        TAG_CONSTANT["van-sku"] = vanSkuMap
    }
}
