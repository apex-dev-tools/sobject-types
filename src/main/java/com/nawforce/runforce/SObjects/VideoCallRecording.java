/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class VideoCallRecording extends SObject {
	public static SObjectType$<VideoCallRecording> SObjectType;
	public static SObjectFields$<VideoCallRecording> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DurationInSeconds;
	public Datetime EndDateTime;
	public Datetime ExpirationDateTime;
	public String ExternalRecordingKey;
	public Long FileSizeInByte;
	public String FileType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public Id VideoCallRecordId;
	public VideoCall VideoCallRecord;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public VideoCallRecording clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecording clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecording clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecording clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecording clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
