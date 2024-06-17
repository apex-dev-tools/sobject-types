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
