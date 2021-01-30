import React from 'react';
import {View, StyleSheet, ToastAndroid} from 'react-native';
import WheelPikerAndroid from './WheelPikerAndroid'
const onItemSelected = event => {
  console.log(event.nativeEvent);
};
const App = () => {
     return (
          <View style={styles.container}>
            <WheelPikerAndroid 
            data={['test1',"test2","test3","test4","test5"]}
            style={styles.whellPicker}
            onChange={onItemSelected}
            />
          </View>
     );
};

const styles = StyleSheet.create({
  container:{   
  flex: 1,
     width: '100%',
},
whellPicker:{
  width:'100%',
  height:200,
},
});

export default App;