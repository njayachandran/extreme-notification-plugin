package org.jenkinsci.plugins.extremenotification.LoggingNotificationEndpoint

def f=namespace(lib.FormTagLib)

custom = instance?.custom
f.optionalBlock(name:"custom", title:_("customize"), checked:custom != null) {
	f.entry(title:_("Format")) {
		f.textbox(name:"format", value:custom?.format)
	}
}
