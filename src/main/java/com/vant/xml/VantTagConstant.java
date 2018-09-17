package main.java.com.vant.xml;

import java.util.HashMap;

public class VantTagConstant {
    public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

    static {
        /* vant */
        HashMap<String, String[]> vanRowMap = new HashMap<>();
        vanRowMap.put("gutter", new String[]{"10"});
        vanRowMap.put("type", new String[]{"flex"});
        vanRowMap.put("justify", new String[]{"start", "center", "end", "space-between", "space-around"});
        vanRowMap.put("align", new String[]{"top", "middle", "bottom"});
        vanRowMap.put("tag", new String[]{"div"});
        TAG_CONSTANT.put("van-row", vanRowMap);

        HashMap<String, String[]> vanColMap = new HashMap<>();
        vanColMap.put("span", new String[]{"8"});
        vanColMap.put("offset", new String[]{"6"});
        vanColMap.put("tag", new String[]{"div"});
        TAG_CONSTANT.put("van-col", vanColMap);

        HashMap<String, String[]> vanBadgeGroupMap = new HashMap<>();
        vanBadgeGroupMap.put(":active-key", new String[]{"0"});
        TAG_CONSTANT.put("van-badge-group", vanBadgeGroupMap);

        HashMap<String, String[]> vanBadgeMap = new HashMap<>();
        vanBadgeMap.put("title", new String[]{});
        vanBadgeMap.put("info", new String[]{});
        vanBadgeMap.put("url", new String[]{});
        TAG_CONSTANT.put("van-badge", vanBadgeMap);

        HashMap<String, String[]> vanButtonMap = new HashMap<>();
        vanButtonMap.put("type", new String[]{"default", "primary", "warning", "danger"});
        vanButtonMap.put("size", new String[]{"normal", "large", "small", "mini"});
        vanButtonMap.put("text", new String[]{});
        vanButtonMap.put("tag", new String[]{});
        vanButtonMap.put("native-type", new String[]{});
        vanButtonMap.put("plain", new String[]{});
        vanButtonMap.put("disabled", new String[]{});
        vanButtonMap.put("loading", new String[]{});
        vanButtonMap.put("block", new String[]{});
        vanButtonMap.put(":plain", new String[]{"true", "false"});
        vanButtonMap.put(":disabled", new String[]{"true", "false"});
        vanButtonMap.put(":loading", new String[]{"true", "false"});
        vanButtonMap.put(":block", new String[]{"true", "false"});
        vanButtonMap.put("@click", new String[]{});
        TAG_CONSTANT.put("van-button", vanButtonMap);

        HashMap<String, String[]> vanCellGroupMap = new HashMap<>();
        vanCellGroupMap.put("border", new String[]{});
        TAG_CONSTANT.put("van-cell-group", vanCellGroupMap);

        HashMap<String, String[]> vanCellMap = new HashMap<>();
        vanCellMap.put("icon", new String[]{});
        vanCellMap.put("title", new String[]{});
        vanCellMap.put("value", new String[]{});
        vanCellMap.put("label", new String[]{});
        vanCellMap.put("border", new String[]{});
        vanCellMap.put("center", new String[]{});
        vanCellMap.put(":border", new String[]{"true", "false"});
        vanCellMap.put(":center", new String[]{"true", "false"});
        vanCellMap.put("url", new String[]{});
        vanCellMap.put("to", new String[]{});
        vanCellMap.put("replace", new String[]{});
        vanCellMap.put("clickable", new String[]{});
        vanCellMap.put("is-link", new String[]{});
        vanCellMap.put("required", new String[]{});
        vanCellMap.put(":clickable", new String[]{"true", "false"});
        vanCellMap.put(":is-link", new String[]{"true", "false"});
        vanCellMap.put(":required", new String[]{"true", "false"});
        vanCellMap.put("arrow-direction", new String[]{"left", "up", "down"});
        vanCellMap.put("slot", new String[]{"right-icon"});
        vanCellMap.put("@click", new String[]{});
        TAG_CONSTANT.put("van-cell", vanCellMap);

        HashMap<String, String[]> vanCircleMap = new HashMap<>();
        vanCircleMap.put("v-model", new String[]{});
        vanCircleMap.put(":rate", new String[]{"100"});
        vanCircleMap.put("size", new String[]{"100px"});
        vanCircleMap.put("color", new String[]{"#38f"});
        vanCircleMap.put("layer-color", new String[]{"#fff"});
        vanCircleMap.put("fill", new String[]{"none"});
        vanCircleMap.put(":speed", new String[]{"100"});
        vanCircleMap.put(":text", new String[]{"text"});
        vanCircleMap.put(":stroke-width", new String[]{"40"});
        vanCircleMap.put(":clockwise", new String[]{"true","false"});
        TAG_CONSTANT.put("van-circle", vanCircleMap);

        HashMap<String, String[]> vanCollapseMap = new HashMap<>();
        vanCollapseMap.put("v-model", new String[]{});
        vanCollapseMap.put("accordion", new String[]{});
        vanCollapseMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-collapse", vanCollapseMap);

        HashMap<String, String[]> vanCollapseItemMap = new HashMap<>();
        vanCollapseItemMap.put("name", new String[]{"1"});
        vanCollapseItemMap.put("title", new String[]{});
        TAG_CONSTANT.put("van-collapse-item", vanCollapseItemMap);

        HashMap<String, String[]> vanIconMap = new HashMap<>();
        vanIconMap.put("name", new String[]{});
        vanIconMap.put("info", new String[]{});
        vanIconMap.put("color", new String[]{});
        vanIconMap.put("size", new String[]{"20px"});
        vanIconMap.put("@click", new String[]{});
        TAG_CONSTANT.put("van-icon", vanIconMap);

        HashMap<String, String[]> vanListMap = new HashMap<>();
        vanListMap.put("v-model", new String[]{});
        vanListMap.put(":loading", new String[]{"true", "false"});
        vanListMap.put(":finished", new String[]{"true", "false"});
        vanListMap.put(":offset", new String[]{"300"});
        vanListMap.put("loading-text", new String[]{"加载中..."});
        vanListMap.put(":immediate-check", new String[]{"true", "false"});
        vanListMap.put("@load", new String[]{});
        TAG_CONSTANT.put("van-list", vanListMap);

        HashMap<String, String[]> vanLoadingMap = new HashMap<>();
        vanLoadingMap.put("color", new String[]{"black", "white"});
        vanLoadingMap.put("type", new String[]{"circular", "spinner"});
        vanLoadingMap.put("size", new String[]{"30px"});
        TAG_CONSTANT.put("van-loading", vanLoadingMap);

        HashMap<String, String[]> vanNavBarMap = new HashMap<>();
        vanNavBarMap.put("title", new String[]{});
        vanNavBarMap.put("left-text", new String[]{});
        vanNavBarMap.put("right-text", new String[]{});
        vanNavBarMap.put(":left-arrow", new String[]{"true", "false"});
        vanNavBarMap.put("left-arrow", new String[]{});
        vanNavBarMap.put(":fixed", new String[]{"true", "false"});
        vanNavBarMap.put("fixed", new String[]{});
        vanNavBarMap.put("z-index", new String[]{"1"});
        vanNavBarMap.put("@click-left", new String[]{});
        vanNavBarMap.put("@click-right", new String[]{});
        TAG_CONSTANT.put("van-nav-bar", vanNavBarMap);

        HashMap<String, String[]> vanNoticeBarMap = new HashMap<>();
        vanNoticeBarMap.put("text", new String[]{});
        vanNoticeBarMap.put("mode", new String[]{"closeable", "link"});
        vanNoticeBarMap.put("delay", new String[]{"1"});
        vanNoticeBarMap.put("speed", new String[]{"50"});
        vanNoticeBarMap.put(":scrollable", new String[]{"true", "false"});
        vanNoticeBarMap.put("scrollable", new String[]{});
        vanNoticeBarMap.put("left-icon", new String[]{});
        vanNoticeBarMap.put("color", new String[]{"#f60"});
        vanNoticeBarMap.put("background", new String[]{"#fff7cc"});
        vanNoticeBarMap.put("@click", new String[]{});
        TAG_CONSTANT.put("van-notice-bar", vanNoticeBarMap);

        HashMap<String, String[]> vanPaginationMap = new HashMap<>();
        vanPaginationMap.put("v-model", new String[]{});
        vanPaginationMap.put("mode", new String[]{"multi", "simple"});
        vanPaginationMap.put(":total-items", new String[]{"10"});
        vanPaginationMap.put(":page-count", new String[]{"10"});
        vanPaginationMap.put(":items-per-page", new String[]{"10"});
        vanPaginationMap.put("prev-text", new String[]{"上一页"});
        vanPaginationMap.put("next-text", new String[]{"下一页"});
        vanPaginationMap.put(":show-page-size", new String[]{"5"});
        vanPaginationMap.put("force-ellipses", new String[]{});
        vanPaginationMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-pagination", vanPaginationMap);

        HashMap<String, String[]> vanPanelMap = new HashMap<>();
        vanPanelMap.put("title", new String[]{});
        vanPanelMap.put("desc", new String[]{});
        vanPanelMap.put("status", new String[]{});
        TAG_CONSTANT.put("van-panel", vanPanelMap);

        HashMap<String, String[]> vanPopupMap = new HashMap<>();
        vanPopupMap.put("v-model", new String[]{"true", "false"});
        vanPopupMap.put(":overlay", new String[]{"true", "false"});
        vanPopupMap.put(":lock-scroll", new String[]{"true", "false"});
        vanPopupMap.put("position", new String[]{"top", "bottom", "right", "left"});
        vanPopupMap.put("overlay-class", new String[]{});
        vanPopupMap.put("overlay-style", new String[]{"{height:200, marginTop:10}"});
        vanPopupMap.put(":close-on-click-overlay", new String[]{"true", "false"});
        vanPopupMap.put("transition", new String[]{"popup-slide"});
        vanPopupMap.put(":lazy-render", new String[]{"true", "false"});
        vanPopupMap.put("get-container", new String[]{"() => HTMLElement"});
        vanPopupMap.put("@click-overlay", new String[]{});
        TAG_CONSTANT.put("van-popup", vanPopupMap);


        HashMap<String, String[]> vanProgressMap = new HashMap<>();
        vanProgressMap.put(":inactive", new String[]{"true", "false"});
        vanProgressMap.put(":percentage", new String[]{"75"});
        vanProgressMap.put(":show-pivot", new String[]{"true", "false"});
        vanProgressMap.put("color", new String[]{"#38f", "linear-gradient(to right, #be99ff, #7232dd)"});
        vanProgressMap.put("text-color", new String[]{"#fff"});
        vanProgressMap.put("pivot-text", new String[]{"purple"});
        vanProgressMap.put("pivot-color", new String[]{"#7232dd"});
        TAG_CONSTANT.put("van-progress", vanProgressMap);


        HashMap<String, String[]> vanStepsMap = new HashMap<>();
        vanStepsMap.put(":active", new String[]{"1"});
        vanStepsMap.put("icon", new String[]{"logistics"});
        vanStepsMap.put("title", new String[]{});
        vanStepsMap.put("description", new String[]{""});
        vanStepsMap.put("icon-class", new String[]{""});
        vanStepsMap.put("direction", new String[]{"horizontal", "vertical"});
        vanStepsMap.put("active-color", new String[]{"#06bf04"});
        TAG_CONSTANT.put("van-steps", vanStepsMap);

        HashMap<String, String[]> vanStepMap = new HashMap<>();
        TAG_CONSTANT.put("van-step", vanStepMap);

        HashMap<String, String[]> vanSwipeMap = new HashMap<>();
        vanSwipeMap.put(":autoplay", new String[]{"3000"});
        vanSwipeMap.put(":duration", new String[]{"500"});
        vanSwipeMap.put(":loop", new String[]{"true", "false"});
        vanSwipeMap.put(":vertical", new String[]{"true", "false"});
        vanSwipeMap.put(":touchable", new String[]{"true", "false"});
        vanSwipeMap.put(":show-indicators", new String[]{"true", "false"});
        vanSwipeMap.put(":initial-swipe", new String[]{"0"});
        vanSwipeMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-swipe", vanSwipeMap);

        HashMap<String, String[]> vanSwipeItemMap = new HashMap<>();
        TAG_CONSTANT.put("van-swipe-item", vanSwipeItemMap);

        HashMap<String, String[]> vanTabsMap = new HashMap<>();
        vanTabsMap.put("v-model", new String[]{"0"});
        vanTabsMap.put("type", new String[]{"line", "card"});
        vanTabsMap.put(":duration", new String[]{"0.2"});
        vanTabsMap.put("line-width", new String[]{});
        vanTabsMap.put("swipe-threshold", new String[]{"4"});
        vanTabsMap.put("sticky", new String[]{"true", "false"});
        vanTabsMap.put(":offset-top", new String[]{"0"});
        vanTabsMap.put("swipeable", new String[]{"true", "false"});
        vanTabsMap.put("@click", new String[]{});
        vanTabsMap.put("@disabled", new String[]{});
        vanTabsMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-tabs", vanTabsMap);

        HashMap<String, String[]> vanTabMap = new HashMap<>();
        vanTabsMap.put("title", new String[]{});
        vanTabsMap.put(":disabled", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-tab", vanTabMap);

        HashMap<String, String[]> vanTabBarMap = new HashMap<>();
        vanTabBarMap.put("v-model", new String[]{});
        vanTabBarMap.put(":fixed", new String[]{"true", "false"});
        vanTabBarMap.put("z-index", new String[]{"1"});
        vanTabBarMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-tabbar", vanTabBarMap);

        HashMap<String, String[]> vanTabBarItem = new HashMap<>();
        vanTabBarItem.put("icon", new String[]{});
        vanTabBarItem.put(":dot", new String[]{"true", "false"});
        vanTabBarItem.put("info", new String[]{});
        vanTabBarItem.put("url", new String[]{});
        vanTabBarItem.put("to", new String[]{});
        vanTabBarItem.put(":replace", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-tabbar-item", vanTabBarItem);

        HashMap<String, String[]> vanTagMap = new HashMap<>();
        vanTagMap.put("type", new String[]{"primary", "success", "danger"});
        vanTagMap.put(":plain", new String[]{"true", "false"});
        vanTagMap.put(":mark", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-tag", vanTagMap);


        HashMap<String, String[]> vanCheckboxMap = new HashMap<>();
        vanCheckboxMap.put("name", new String[]{});
        vanCheckboxMap.put("v-model", new String[]{"true", "false"});
        vanCheckboxMap.put(":disabled", new String[]{"true", "false"});
        vanCheckboxMap.put(":label-disabled", new String[]{"true", "false"});
        vanCheckboxMap.put("label-position", new String[]{"right", "left"});
        vanCheckboxMap.put("shape", new String[]{"round", "square"});
        vanCheckboxMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-checkbox", vanCheckboxMap);

        HashMap<String, String[]> vanCheckboxGroupMap = new HashMap<>();
        vanCheckboxGroupMap.put("v-model", new String[]{"['a', 'b']"});
        vanCheckboxGroupMap.put(":disabled", new String[]{"true", "false"});
        vanCheckboxGroupMap.put(":max", new String[]{"0"});
        TAG_CONSTANT.put("van-checkbox-group", vanCheckboxGroupMap);

        HashMap<String, String[]> vanFieldMap = new HashMap<>();
        vanFieldMap.put("label", new String[]{});
        vanFieldMap.put("value", new String[]{});
        vanFieldMap.put("type", new String[]{"text", "password", "number", "tel", "textarea"});
        vanFieldMap.put(":border", new String[]{"true", "false"});
        vanFieldMap.put(":disabled", new String[]{"true", "false"});
        vanFieldMap.put(":readonly", new String[]{"true", "false"});
        vanFieldMap.put(":clearable", new String[]{"true", "false"});
        vanFieldMap.put(":required", new String[]{"true", "false"});
        vanFieldMap.put(":is-link", new String[]{"true", "false"});
        vanFieldMap.put(":error", new String[]{"true", "false"});
        vanFieldMap.put("error-message", new String[]{});
        vanFieldMap.put("label-align", new String[]{"left", "center", "right"});
        vanFieldMap.put("input-align", new String[]{"left", "center", "right"});
        vanFieldMap.put("autosize", new String[]{"medium", "small", "mini"});
        vanFieldMap.put("icon", new String[]{"true", "false", "{ maxHeight: 100, minHeight: 50 }"});
        vanFieldMap.put("left-icon", new String[]{});
        vanFieldMap.put("@click-icon", new String[]{});
        vanFieldMap.put("@blur", new String[]{});
        TAG_CONSTANT.put("van-field", vanFieldMap);

        HashMap<String, String[]> vanNumberKeyboardMap = new HashMap<>();
        vanNumberKeyboardMap.put(":show", new String[]{"true", "false"});
        vanNumberKeyboardMap.put("theme", new String[]{"default", "custom"});
        vanNumberKeyboardMap.put("title", new String[]{});
        vanNumberKeyboardMap.put(":transition", new String[]{"true", "false"});
        vanNumberKeyboardMap.put(":z-index", new String[]{"100"});
        vanNumberKeyboardMap.put("extra-key", new String[]{});
        vanNumberKeyboardMap.put("close-button-text", new String[]{});
        vanNumberKeyboardMap.put(":show-delete-key", new String[]{"true", "false"});
        vanNumberKeyboardMap.put(":hide-on-click-outside", new String[]{"true", "false"});
        vanNumberKeyboardMap.put("@input", new String[]{});
        vanNumberKeyboardMap.put("@delete", new String[]{});
        vanNumberKeyboardMap.put("@close", new String[]{});
        vanNumberKeyboardMap.put("@blur", new String[]{});
        vanNumberKeyboardMap.put("@show", new String[]{});
        vanNumberKeyboardMap.put("@hide", new String[]{});
        TAG_CONSTANT.put("van-number-keyboard", vanNumberKeyboardMap);

        HashMap<String, String[]> vanPasswordInputMap = new HashMap<>();
        vanPasswordInputMap.put(":value", new String[]{});
        vanPasswordInputMap.put(":length", new String[]{"6"});
        vanPasswordInputMap.put("info", new String[]{});
        vanPasswordInputMap.put("error-info", new String[]{});
        vanPasswordInputMap.put("@focus", new String[]{});
        TAG_CONSTANT.put("van-password-input", vanPasswordInputMap);

        HashMap<String, String[]> vanRadioGroupMap = new HashMap<>();
        vanRadioGroupMap.put("v-model", new String[]{});
        vanRadioGroupMap.put(":disabled", new String[]{"true", "false"});
        vanRadioGroupMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-radio-group", vanRadioGroupMap);

        HashMap<String, String[]> vanRadioMap = new HashMap<>();
        vanRadioMap.put("name", new String[]{});
        vanRadioMap.put(":disabled", new String[]{"true", "false"});
        vanRadioMap.put(":label-disabled", new String[]{"true", "false"});
        vanRadioMap.put("label-position", new String[]{"right", "left"});
        TAG_CONSTANT.put("van-radio", vanRadioMap);

        HashMap<String, String[]> vanRateMap = new HashMap<>();
        vanRateMap.put("v-model", new String[]{"3"});
        vanRateMap.put(":count", new String[]{"5"});
        vanRateMap.put(":size", new String[]{"20"});
        vanRateMap.put("color", new String[]{"#ffd21e"});
        vanRateMap.put("void-color", new String[]{"#bdbdbd"});
        vanRateMap.put("disabled-color", new String[]{"#bdbdbd"});
        vanRateMap.put(":disabled", new String[]{"true", "false"});
        vanRateMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-rate", vanRateMap);

        HashMap<String, String[]> vanSearchMap = new HashMap<>();
        vanSearchMap.put("background", new String[]{"#f2f2f2"});
        vanSearchMap.put(":show-action", new String[]{"true", "false"});
        vanSearchMap.put("@cancel", new String[]{});
        vanSearchMap.put("@search", new String[]{});
        vanSearchMap.put("@focus", new String[]{});
        vanSearchMap.put("@blur", new String[]{});
        vanSearchMap.put("@keypress", new String[]{});
        TAG_CONSTANT.put("van-search", vanSearchMap);

        HashMap<String, String[]> vanSliderMap = new HashMap<>();
        vanSliderMap.put("v-model", new String[]{"0"});
        vanSliderMap.put(":disabled", new String[]{"true", "false"});
        vanSliderMap.put(":max", new String[]{"100"});
        vanSliderMap.put(":min", new String[]{"0"});
        vanSliderMap.put(":step", new String[]{"1"});
        vanSliderMap.put(":bar-height", new String[]{"2px"});
        vanSliderMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-slider", vanSliderMap);

        HashMap<String, String[]> vanStepperMap = new HashMap<>();
        vanStepperMap.put("v-model", new String[]{"1"});
        vanStepperMap.put(":min", new String[]{"1"});
        vanStepperMap.put(":max", new String[]{"10"});
        vanStepperMap.put(":step", new String[]{"1"});
        vanStepperMap.put(":integer", new String[]{"true", "false"});
        vanStepperMap.put(":disabled", new String[]{"true", "false"});
        vanStepperMap.put(":disable-input", new String[]{"true", "false"});
        vanStepperMap.put("@change", new String[]{});
        vanStepperMap.put("@overlimit", new String[]{});
        vanStepperMap.put("@plus", new String[]{});
        vanStepperMap.put("@minus", new String[]{});
        vanStepperMap.put("@blur", new String[]{});
        TAG_CONSTANT.put("van-stepper", vanStepperMap);

        HashMap<String, String[]> vanSwitchMap = new HashMap<>();
        vanSwitchMap.put("v-model", new String[]{"true", "false"});
        vanSwitchMap.put(":loading", new String[]{"true", "false"});
        vanSwitchMap.put(":disabled", new String[]{"true", "false"});
        vanSwitchMap.put("size", new String[]{"30px"});
        vanSwitchMap.put("@change", new String[]{});
        TAG_CONSTANT.put("van-switch", vanSwitchMap);

        HashMap<String, String[]> vanUploaderMap = new HashMap<>();
        vanUploaderMap.put("result-type", new String[]{"dataUrl", "test"});
        vanUploaderMap.put("accept", new String[]{"image/*"});
        vanUploaderMap.put(":disabled", new String[]{"true", "false"});
        vanUploaderMap.put("before-read", new String[]{"Function()"});
        vanUploaderMap.put("after-read", new String[]{"Function(file, content)"});
        vanUploaderMap.put("max-size", new String[]{"1000000"});
        vanUploaderMap.put("@oversize", new String[]{});
        TAG_CONSTANT.put("van-uploader", vanUploaderMap);

        HashMap<String, String[]> vanActionSheetMap = new HashMap<>();
        vanActionSheetMap.put("actions", new String[]{"[{name: 'title', subname: 'subtitle', className: 'className for the option', loading: true, disabled:false}]"});
        vanActionSheetMap.put("title", new String[]{});
        vanActionSheetMap.put("cancel-text", new String[]{});
        vanActionSheetMap.put(":overlay", new String[]{"true", "false"});
        vanActionSheetMap.put(":close-on-click-overlay", new String[]{"true", "false"});
        vanActionSheetMap.put(":lazy-render", new String[]{"true", "false"});
        vanActionSheetMap.put("get-container", new String[]{"() => HTMLElement"});
        vanActionSheetMap.put("@select", new String[]{"Function(item)"});
        vanActionSheetMap.put("@cancel", new String[]{});
        TAG_CONSTANT.put("van-actionsheet", vanActionSheetMap);

        HashMap<String, String[]> vanDateTimePickerMap = new HashMap<>();
        vanDateTimePickerMap.put("v-model", new String[]{"new Date()"});
        vanDateTimePickerMap.put("type", new String[]{"datetime", "date", "time", "year-month"});
        vanDateTimePickerMap.put(":min-date", new String[]{"new Date()"});
        vanDateTimePickerMap.put(":max-date", new String[]{"new Date()"});
        vanDateTimePickerMap.put(":min-hour", new String[]{"0"});
        vanDateTimePickerMap.put(":max-hour", new String[]{"23"});
        vanDateTimePickerMap.put(":min-minute", new String[]{"0"});
        vanDateTimePickerMap.put(":max-minute", new String[]{"59"});
        vanDateTimePickerMap.put(":formatter", new String[]{"(type, value) => value"});
        vanDateTimePickerMap.put("title", new String[]{});
        vanDateTimePickerMap.put(":loading", new String[]{"true", "false"});
        vanDateTimePickerMap.put(":item-height", new String[]{"44"});
        vanDateTimePickerMap.put("confirm-button-text", new String[]{});
        vanDateTimePickerMap.put("cancel-button-text", new String[]{});
        vanDateTimePickerMap.put(":visible-item-count", new String[]{"5"});
        vanDateTimePickerMap.put("@change", new String[]{"Function(picker)"});
        vanDateTimePickerMap.put("@confirm", new String[]{"Function(value)"});
        vanDateTimePickerMap.put("@cancel", new String[]{});
        TAG_CONSTANT.put("van-datetime-picker", vanDateTimePickerMap);

        HashMap<String, String[]> vanDialogMap = new HashMap<>();
        vanDialogMap.put("v-model", new String[]{"true", "false"});
        vanDialogMap.put("title", new String[]{});
        vanDialogMap.put("message", new String[]{});
        vanDialogMap.put(":show-confirm-button", new String[]{"true", "false"});
        vanDialogMap.put(":show-cancel-button", new String[]{"true", "false"});
        vanDialogMap.put("confirm-button-text", new String[]{});
        vanDialogMap.put("cancel-button-text", new String[]{});
        vanDialogMap.put(":overlay", new String[]{"true", "false"});
        vanDialogMap.put(":close-on-click-overlay", new String[]{"true", "false"});
        vanDialogMap.put(":lock-scroll", new String[]{"true", "false"});
        vanDialogMap.put(":before-close", new String[]{"(action: string, done: function) => void"});
        vanDialogMap.put("get-container", new String[]{"() => HTMLElement"});
        TAG_CONSTANT.put("van-dialog", vanDialogMap);

        HashMap<String, String[]> vanPickerMap = new HashMap<>();
        vanPickerMap.put("columns", new String[]{"['Delaware', 'Florida', 'Georqia', 'Indiana', 'Maine']"});
        vanPickerMap.put(":show-toolbar", new String[]{"true", "false"});
        vanPickerMap.put("title", new String[]{});
        vanPickerMap.put(":loading", new String[]{"true", "false"});
        vanPickerMap.put("value-key", new String[]{});
        vanPickerMap.put(":item-height", new String[]{"44"});
        vanPickerMap.put("confirm-button-text", new String[]{});
        vanPickerMap.put("cancel-button-text", new String[]{});
        vanPickerMap.put(":visible-item-count", new String[]{"5"});
        vanPickerMap.put("@confirm", new String[]{"Function(value, index)"});
        vanPickerMap.put("@cancel", new String[]{"Function(value, index)"});
        vanPickerMap.put("@change", new String[]{"Function(picker, value, index)"});
        TAG_CONSTANT.put("van-picker", vanPickerMap);

        HashMap<String, String[]> vanPullRefreshMap = new HashMap<>();
        vanPullRefreshMap.put("v-model", new String[]{"true", "false"});
        vanPullRefreshMap.put("pulling-text", new String[]{"Pull to refresh..."});
        vanPullRefreshMap.put("loosing-text", new String[]{"Loose to refresh..."});
        vanPullRefreshMap.put("loading-text", new String[]{"Loading..."});
        vanPullRefreshMap.put(":animation-duration", new String[]{"300"});
        vanPullRefreshMap.put(":head-height", new String[]{"50"});
        vanPullRefreshMap.put(":disabled", new String[]{"true", "false"});
        vanPullRefreshMap.put("@refresh", new String[]{});
        TAG_CONSTANT.put("van-pull-refresh", vanPullRefreshMap);

        HashMap<String, String[]> vanSwipeCellMap = new HashMap<>();
        vanSwipeCellMap.put(":left-width", new String[]{"0"});
        vanSwipeCellMap.put(":right-width", new String[]{"0"});
        vanSwipeCellMap.put(":on-close", new String[]{"Function(clickPosition, instance)"});
        TAG_CONSTANT.put("van-swipe-cell", vanSwipeCellMap);

        HashMap<String, String[]> vanSwitchCellMap = new HashMap<>();
        vanSwitchCellMap.put("v-model", new String[]{"true", "false"});
        vanSwitchCellMap.put("title", new String[]{});
        vanSwitchCellMap.put(":loading", new String[]{"true", "false"});
        vanSwitchCellMap.put(":disabled", new String[]{"true", "false"});
        vanSwitchCellMap.put(":size", new String[]{"26px"});
        vanSwitchCellMap.put("@change", new String[]{"Function(checked)"});
        TAG_CONSTANT.put("van-switch-cell", vanSwitchCellMap);

        HashMap<String, String[]> vanTreeSelectMap = new HashMap<>();
        vanTreeSelectMap.put(":items", new String[]{"[{text: 'All Cities',children: [{text: 'Washington',id: 1002},{text: 'Baltimore',id: 1001}]}]"});
        vanTreeSelectMap.put(":main-active-index", new String[]{"0"});
        vanTreeSelectMap.put(":active-id", new String[]{"0"});
        vanTreeSelectMap.put("@navclick", new String[]{"Function(index)"});
        vanTreeSelectMap.put("@itemclick", new String[]{"Function(data)"});
        TAG_CONSTANT.put("van-tree-select", vanTreeSelectMap);

        HashMap<String, String[]> vanAddressEditMap = new HashMap<>();
        vanAddressEditMap.put("area-list", new String[]{"{province_list: {110000: 'Beijing',330000: 'Zhejiang Province'},city_list: {110100: 'Beijing City',330100: 'Hangzhou',},county_list: {110101: 'Dongcheng District',110102: 'Xicheng District',110105: 'Chaoyang District',110106: 'Fengtai District'330105: 'Gongshu District',330106: 'Xihu District'}}"});
        vanAddressEditMap.put("address-info", new String[]{"{id:1,name:'1',tel:'1',province:'1',city:'1',county:'1',addressDetail:'1',areaCode:'1',postalCode:'1',isDefault:true}"});
        vanAddressEditMap.put("search-result", new String[]{"[{name:'1',address:'1'}]"});
        vanAddressEditMap.put("show-postal", new String[]{"true", "false"});
        vanAddressEditMap.put("show-delete", new String[]{"true", "false"});
        vanAddressEditMap.put("show-set-default", new String[]{"true", "false"});
        vanAddressEditMap.put("show-search-result", new String[]{"true", "false"});
        vanAddressEditMap.put("save-button-text", new String[]{});
        vanAddressEditMap.put("delete-button-text", new String[]{});
        vanAddressEditMap.put("is-saving", new String[]{"true", "false"});
        vanAddressEditMap.put("is-deleting", new String[]{"true", "false"});
        vanAddressEditMap.put(":tel-validator", new String[]{"(tel: string) => boolean"});
        vanAddressEditMap.put("@save", new String[]{"Function(content)"});
        vanAddressEditMap.put("@focus", new String[]{"Function(key)"});
        vanAddressEditMap.put("@delete", new String[]{"Function(content)"});
        vanAddressEditMap.put("@cancel-delete", new String[]{"Function(content)"});
        vanAddressEditMap.put("@select-search", new String[]{"Function(value)"});
        vanAddressEditMap.put("@change-area", new String[]{"Function(values)"});
        vanAddressEditMap.put("@change-detail", new String[]{"Function(value)"});
        TAG_CONSTANT.put("van-address-edit", vanAddressEditMap);

        HashMap<String, String[]> vanAddressListMap = new HashMap<>();
        vanAddressListMap.put("v-model", new String[]{});
        vanAddressListMap.put("list", new String[]{"[{id: '1',name: 'John Snow',tel: '13000000000',address: 'Somewhere'},{id: '2',name: 'Ned Stark',tel: '1310000000',address: 'Somewhere'}]"});
        vanAddressListMap.put("add-button-text", new String[]{});
        vanAddressListMap.put("@add", new String[]{});
        vanAddressListMap.put("@edit", new String[]{"Function(item, index)"});
        vanAddressListMap.put("@select", new String[]{"Function(item, index)"});
        TAG_CONSTANT.put("van-address-list", vanAddressListMap);

        HashMap<String, String[]> vanAreaMap = new HashMap<>();
        vanAreaMap.put(":value", new String[]{});
        vanAreaMap.put("title", new String[]{});
        vanAreaMap.put(":area-list", new String[]{"{province_list: {110000: 'Beijing',330000: 'Zhejiang Province'},city_list: {110100: 'Beijing City',330100: 'Hangzhou',},county_list: {110101: 'Dongcheng District',110102: 'Xicheng District',110105: 'Chaoyang District',110106: 'Fengtai District'330105: 'Gongshu District',330106: 'Xihu District'}}"});
        vanAreaMap.put(":columns-num", new String[]{"3"});
        vanAreaMap.put(":loading", new String[]{"true", "false"});
        vanAreaMap.put(":item-height", new String[]{"44"});
        vanAreaMap.put("visible-item-count", new String[]{"5"});
        vanAreaMap.put("@confirm", new String[]{"Function([{code: '330000',name: 'Zhejiang Province'},{code: '330100',name: 'Hangzhou'},{code: '330105',name: 'Xihu District'}])"});
        vanAreaMap.put("@cancel", new String[]{});
        vanAreaMap.put("@change", new String[]{"Function(picker)"});
        TAG_CONSTANT.put("van-area", vanAreaMap);

        HashMap<String, String[]> vanCardMap = new HashMap<>();
        vanCardMap.put(":thumb", new String[]{});
        vanCardMap.put(":title", new String[]{});
        vanCardMap.put(":desc", new String[]{});
        vanCardMap.put(":num", new String[]{"1"});
        vanCardMap.put(":price", new String[]{"0.01"});
        vanCardMap.put(":centered", new String[]{"true", "false"});
        vanCardMap.put(":currency", new String[]{"¥"});
        TAG_CONSTANT.put("van-card", vanCardMap);

        HashMap<String, String[]> vanContactCardMap = new HashMap<>();
        vanContactCardMap.put(":type", new String[]{"add", "edit"});
        vanContactCardMap.put(":name", new String[]{});
        vanContactCardMap.put(":tel", new String[]{});
        vanContactCardMap.put(":add-text", new String[]{});
        TAG_CONSTANT.put("van-contact-card", vanContactCardMap);

        HashMap<String, String[]> vanContactListMap = new HashMap<>();
        vanContactListMap.put("v-model", new String[]{});
        vanContactListMap.put(":list", new String[]{"[{name: 'John Snow',tel: '13000000000',id: 0}]"});
        vanContactListMap.put("add-text", new String[]{});
        vanContactListMap.put("@add", new String[]{});
        vanContactListMap.put("@edit", new String[]{"Function(item, index)"});
        vanContactListMap.put("@select", new String[]{"Function(item, index)"});
        TAG_CONSTANT.put("van-contact-list", vanContactListMap);

        HashMap<String, String[]> vanContactEdit = new HashMap<>();
        vanContactEdit.put(":contact-info", new String[]{"{name: 'John Snow',tel: '13000000000',id: 0}"});
        vanContactEdit.put(":is-edit", new String[]{"true", "false"});
        vanContactEdit.put(":is-saving", new String[]{"true", "false"});
        vanContactEdit.put(":is-deleting", new String[]{"true", "false"});
        vanContactEdit.put(":tel-validator", new String[]{"(tel: string) => boolean"});
        vanContactEdit.put("@save", new String[]{"Function(content)"});
        vanContactEdit.put("@delete", new String[]{"Function(content)"});
        TAG_CONSTANT.put("van-contact-edit", vanContactEdit);

        HashMap<String, String[]> vanCouponCellMap = new HashMap<>();
        vanCouponCellMap.put("title", new String[]{});
        vanCouponCellMap.put(":chosen-coupon", new String[]{"-1"});
        vanCouponCellMap.put(":coupons", new String[]{"[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]"});
        vanCouponCellMap.put(":editable", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-coupon-cell", vanCouponCellMap);

        HashMap<String, String[]> vanCouponListMap = new HashMap<>();
        vanCouponListMap.put("v-model", new String[]{});
        vanCouponListMap.put(":chosen-coupon", new String[]{"-1"});
        vanCouponListMap.put(":coupons", new String[]{"[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]"});
        vanCouponListMap.put(":disabled-coupons", new String[]{"[{available: 1,discount: 0,denominations: 150,originCondition: 0,reason: '',value: 150,name: 'Coupon name',startAt: 1489104000,endAt: 1514592000}]"});
        vanCouponListMap.put(":exchange-button-text", new String[]{});
        vanCouponListMap.put(":exchange-button-loading", new String[]{"true", "false"});
        vanCouponListMap.put(":exchange-button-disabled", new String[]{"true", "false"});
        vanCouponListMap.put(":exchange-min-length", new String[]{"1"});
        vanCouponListMap.put(":displayed-coupon-index", new String[]{});
        vanCouponListMap.put("close-button-text", new String[]{});
        vanCouponListMap.put(":show-close-button", new String[]{"true", "false"});
        vanCouponListMap.put("disabled-list-title", new String[]{});
        vanCouponListMap.put("input-placeholder", new String[]{});
        vanCouponListMap.put(":show-exchange-bar", new String[]{"true", "false"});
        vanCouponListMap.put("@change", new String[]{"Function(index)"});
        vanCouponListMap.put("@exchange", new String[]{"Function(code)"});
        TAG_CONSTANT.put("van-coupon-list", vanCouponListMap);

        HashMap<String, String[]> vanGoodsActionMap = new HashMap<>();
        TAG_CONSTANT.put("van-goods-action", vanGoodsActionMap);

        HashMap<String, String[]> vanGoodsActionBigBtnMap = new HashMap<>();
        vanGoodsActionBigBtnMap.put("text", new String[]{});
        vanGoodsActionBigBtnMap.put("primary", new String[]{"true", "false"});
        vanGoodsActionBigBtnMap.put("url", new String[]{});
        vanGoodsActionBigBtnMap.put("to", new String[]{});
        vanGoodsActionBigBtnMap.put("replace", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-goods-action-big-btn", vanGoodsActionBigBtnMap);

        HashMap<String, String[]> vanGoodsActionMiniBtnMap = new HashMap<>();
        vanGoodsActionMiniBtnMap.put("text", new String[]{});
        vanGoodsActionMiniBtnMap.put("icon", new String[]{});
        vanGoodsActionMiniBtnMap.put("icon-class", new String[]{});
        vanGoodsActionMiniBtnMap.put("info", new String[]{});
        vanGoodsActionMiniBtnMap.put("url", new String[]{});
        vanGoodsActionMiniBtnMap.put("to", new String[]{});
        vanGoodsActionMiniBtnMap.put("replace", new String[]{"true", "false"});
        TAG_CONSTANT.put("van-goods-action-mini-btn", vanGoodsActionMiniBtnMap);

        HashMap<String, String[]> vanSubmitBarMap = new HashMap<>();
        vanSubmitBarMap.put(":price", new String[]{"0.00"});
        vanSubmitBarMap.put("label", new String[]{});
        vanSubmitBarMap.put("button-text", new String[]{});
        vanSubmitBarMap.put(":button-type", new String[]{"danger"});
        vanSubmitBarMap.put("tip", new String[]{});
        vanSubmitBarMap.put(":disabled", new String[]{"true", "false"});
        vanSubmitBarMap.put("loading", new String[]{"true", "false"});
        vanSubmitBarMap.put(":currency", new String[]{"¥"});
        vanSubmitBarMap.put("@submit", new String[]{});
        TAG_CONSTANT.put("van-submit-bar", vanSubmitBarMap);

        HashMap<String, String[]> vanSkuMap = new HashMap<>();
        vanSkuMap.put("v-model", new String[]{"true", "false"});
        vanSkuMap.put(":sku", new String[]{});
        vanSkuMap.put(":goods", new String[]{"{title: 'Title',picture: 'https://img.yzcdn.cn/1.jpg'}"});
        vanSkuMap.put(":goods-id", new String[]{});
        vanSkuMap.put(":hide-stock", new String[]{"true", "false"});
        vanSkuMap.put(":show-add-cart-btn", new String[]{"true", "false"});
        vanSkuMap.put(":quota", new String[]{"0"});
        vanSkuMap.put(":quota-used", new String[]{"0"});
        vanSkuMap.put(":reset-stepper-on-hide", new String[]{"true", "false"});
        vanSkuMap.put(":reset-selected-sku-on-hide", new String[]{"true", "false"});
        vanSkuMap.put(":disable-stepper-input", new String[]{"true", "false"});
        vanSkuMap.put(":close-on-click-overlay", new String[]{"true", "false"});
        vanSkuMap.put("stepper-title", new String[]{});
        vanSkuMap.put(":custom-stepper-config", new String[]{});
        vanSkuMap.put(":message-config", new String[]{});
        vanSkuMap.put(":get-container", new String[]{"() => HTMLElement"});
        vanSkuMap.put("@add-cart", new String[]{"Function(skuData:Object)"});
        vanSkuMap.put("@buy-clicked", new String[]{"Function(skuData:Object)"});
        vanSkuMap.put("@stepper-change", new String[]{"Function(value:Number)"});
        TAG_CONSTANT.put("van-sku", vanSkuMap);
    }
}
