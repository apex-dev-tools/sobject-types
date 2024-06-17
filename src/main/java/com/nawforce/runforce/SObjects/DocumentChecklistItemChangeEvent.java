/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DocumentChecklistItemChangeEvent extends SObject {
	public static SObjectType$<DocumentChecklistItemChangeEvent> SObjectType;
	public static SObjectFields$<DocumentChecklistItemChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DocumentCategoryId;
	public DocumentCategory DocumentCategory;
	public Id Id;
	public String Instruction;
	public Boolean IsAccepted;
	public Boolean IsFrozen;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public Id ReceivedDocumentId;
	public ReceivedDocument ReceivedDocument;
	public String ReplayId;
	public String Status;
	public String TransformationInfo;
	public Id UploadedById;
	public User UploadedBy;
	public Id WhoId;
	public SObject Who;

	public DocumentChecklistItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
