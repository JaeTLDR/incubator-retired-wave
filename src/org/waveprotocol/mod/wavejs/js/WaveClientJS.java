package org.waveprotocol.mod.wavejs.js;

import com.google.gwt.core.client.JavaScriptObject;

import org.waveprotocol.mod.wavejs.WaveClient;

public class WaveClientJS extends JavaScriptObject {




  /**
   * The JS Wave Client main interface. Backed by WaveClient
   *
   * Design ideas are:
   *
   * <li>Multiple waves opened simultaneously</li> <li>Multiple collaborative
   * contents in a wave</li> <li>Provide UI for complex contents (e.g. text
   * editor), hook in a DOM element</i>
   *
   */
  public static final native WaveClientJS create(WaveClient delegate) /*-{


    var wavejs = {

         callbackMap: new Object(),

         startSession: function(url, user, password, onSuccess, onFailure) {

            this.callbackMap.startSession = new Object();
            this.callbackMap.startSession.onSuccess = onSuccess;
            this.callbackMap.startSession.onFailure = onFailure;

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::startSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(url, user, password);

         },

         stopSession: function() {

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::stopSession()();
         },

         openWave: function(wave, onSuccess, onFailure) {

              this.callbackMap.openWave = new Object();
              this.callbackMap.openWave.onSuccess = onSuccess;
              this.callbackMap.openWave.onFailure = onFailure;

              return delegate.@org.waveprotocol.mod.wavejs.WaveClient::openWave(Ljava/lang/String;)(wave);
         },

         closeWave: function(wave) {

             return delegate.@org.waveprotocol.mod.wavejs.WaveClient::closeWave(Ljava/lang/String;)(wave);
         },


         openChat: function(wave, onSuccess, onFailure) {

            this.callbackMap.openChat = new Object();
            this.callbackMap.openChat.onSuccess = onSuccess;
            this.callbackMap.openChat.onFailure = onFailure;

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::openChat(Ljava/lang/String;)(wave);

         },


         createChat: function(onSuccess, onFailure) {

            this.callbackMap.createChat = new Object();
            this.callbackMap.createChat.onSuccess = onSuccess;
            this.callbackMap.createChat.onFailure = onFailure;

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::createChat()();

         },

         openCommunityModel: function(wave, onSuccess, onFailure) {

            this.callbackMap.openCommunityModel = new Object();
            this.callbackMap.openCommunityModel.onSuccess = onSuccess;
            this.callbackMap.openCommunityModel.onFailure = onFailure;

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::openCommunityModel(Ljava/lang/String;)(wave);

         },


         createCommunityModel: function(onSuccess, onFailure) {

            this.callbackMap.createCommunityModel = new Object();
            this.callbackMap.createCommunityModel.onSuccess = onSuccess;
            this.callbackMap.createCommunityModel.onFailure = onFailure;

            return delegate.@org.waveprotocol.mod.wavejs.WaveClient::createCommunityModel()();

         }

    }; // wavejs

    // Accessible from the Window object
    $wnd.WaveJS = wavejs;

    return wavejs;

  }-*/;




  protected WaveClientJS() {

  }




  public final native void callbackEvent(String method, String event, Object parameter) /*-{
      this.callbackMap[method][event](parameter);
  }-*/;


}