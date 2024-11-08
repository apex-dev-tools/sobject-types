/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceReport extends SObject {
	public static SObjectType$<ServiceReport> SObjectType;
	public static SObjectFields$<ServiceReport> Fields;

	public Id ContentVersionDocumentId;
	public ContentVersion ContentVersionDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Blob DocumentBody;
	public String DocumentContentType;
	public Integer DocumentLength;
	public String DocumentName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSigned;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public Name Parent;
	public String ServiceReportLanguage;
	public String ServiceReportNumber;
	public Datetime SystemModstamp;
	public String Template;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public DocumentRecipient[] DocumentRecipients;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ServiceReportHistory[] Histories;

	public ServiceReport clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceReport clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceReport clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceReport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceReport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
