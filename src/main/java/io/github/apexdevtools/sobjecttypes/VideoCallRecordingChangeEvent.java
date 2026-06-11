/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class VideoCallRecordingChangeEvent extends SObject {
	public static SObjectType$<VideoCallRecordingChangeEvent> SObjectType;
	public static SObjectFields$<VideoCallRecordingChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DurationInSeconds;
	public Datetime EndDateTime;
	public Datetime ExpirationDateTime;
	public String ExternalRecordingKey;
	public String ExternalRecordingKeyLong;
	public Long FileSizeInByte;
	public String FileType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Datetime StartDateTime;
	public Id VideoCallRecordId;
	public VideoCall VideoCallRecord;

	public VideoCallRecordingChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecordingChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallRecordingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
