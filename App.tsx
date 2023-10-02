import { View, Text, NativeModules, Pressable } from 'react-native'
import React from 'react'



const App = () => {

  const {MyMessage}=NativeModules

  const showMessageHndler=()=>{
   MyMessage.sayHello("NITIN",(err, message)=>{
    if(err){
      console.log(err)
    }else{
      alert(`message: ${message}`)
    }

   })
  }
  return (
    <View style={{flex:1, justifyContent:'center',alignItems:'center'}}>
      <Pressable onPress={showMessageHndler}>
      <Text>Display Message</Text>
      </Pressable>
    </View>
  )
}

export default App