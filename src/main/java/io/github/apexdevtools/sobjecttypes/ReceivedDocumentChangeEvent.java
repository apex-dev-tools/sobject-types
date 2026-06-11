/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ReceivedDocumentChangeEvent extends SObject {
	public static SObjectType$<ReceivedDocumentChangeEvent> SObjectType;
	public static SObjectFields$<ReceivedDocumentChangeEvent> Fields;

	public String BulkApiJobNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Direction;
	public String DocumentNumber;
	public Integer FailedRecordCount;
	public Id FailedRecordsFileId;
	public ContentDocument FailedRecordsFile;
	public String FailureReason;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public Integer ProcessedRecordCount;
	public String ProcessingStatus;
	public String ReplayId;
	public String Source;
	public String Status;
	public String StatusReason;
	public String TargetObjectApiName;
	public Id UnprocessedRecordsFileId;
	public ContentDocument UnprocessedRecordsFile;

	public ReceivedDocumentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReceivedDocumentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReceivedDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReceivedDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReceivedDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
