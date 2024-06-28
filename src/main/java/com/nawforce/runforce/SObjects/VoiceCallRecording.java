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
public class VoiceCallRecording extends SObject {
	public static SObjectType$<VoiceCallRecording> SObjectType;
	public static SObjectFields$<VoiceCallRecording> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DurationInSeconds;
	public Id Id;
	public Boolean IsConsented;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MediaContentId;
	public ContentDocument MediaContent;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public Id VoiceCallId;
	public VoiceCall VoiceCall;

	public VoiceCallRecording clone$() {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecording clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecording clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecording clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCallRecording clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
