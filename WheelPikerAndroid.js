import {View, requireNativeComponent} from 'react-native'
const settings={
    name:"RCTWheelPiker",
    propsTypes:{
        ...View.prototype
    },
};

export default requireNativeComponent('RCTWheelPiker',settings);