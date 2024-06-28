/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class VoiceCallRecordingChangeEvent extends SObject {
	public static SObjectType$<VoiceCallRecordingChangeEvent> SObjectType;
	public static SObjectFields$<VoiceCallRecordingChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DurationInSeconds;
	public Id Id;
	public Boolean IsConsented;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MediaContentId;
	public ContentDocument MediaContent;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id VoiceCallId;
	public VoiceCall VoiceCall;

	public VoiceCallRecordingChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecordingChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
