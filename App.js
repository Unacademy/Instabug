import React, {Component} from 'react';  
import {StyleSheet, Text, View} from 'react-native';  
import Instabug, { BugReporting, Surveys, FeatureRequests } from 'instabug-reactnative';

  
export default class App extends Component {  

  componentDidMount() {
    // Instabug.startWithToken('TOKEN', [Instabug.invocationEvent.floatingButton]);
    try {
      throw new SyntaxError();
    } catch (error) {
      alert(error.name);
      Instabug.reportJSException(error);
    }
  }

  render() {  
    return (  
      <View style={styles.container}>  
        <Text style={styles.welcome}>Welcome to React Native!</Text>  
      </View>  
    );  
  }  
}  
  
const styles = StyleSheet.create({  
  container: {  
    flex: 1,  
    justifyContent: 'center',  
    alignItems: 'center',  
    backgroundColor: '#F5FCFF',  
  },  
  welcome: {  
    fontSize: 20,  
    textAlign: 'center',  
    margin: 10,  
  },  
  instructions: {  
    textAlign: 'center',  
    color: '#333333',  
    marginBottom: 5,  
  },  
});  