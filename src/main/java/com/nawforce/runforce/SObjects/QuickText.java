/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class QuickText extends SObject {
	public static SObjectType$<QuickText> SObjectType;
	public static SObjectFields$<QuickText> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public String Category;
	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FolderId;
	public Folder Folder;
	public String FolderName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInsertable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Message;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String SourceType;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public QuickTextHistory[] Histories;
	public QuickTextShare[] Shares;

	public QuickText clone$() {throw new java.lang.UnsupportedOperationException();}
	public QuickText clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QuickText clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QuickText clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QuickText clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
