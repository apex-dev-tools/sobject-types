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
public class AuditTrailFileExport extends SObject {
	public static SObjectType$<AuditTrailFileExport> SObjectType;
	public static SObjectFields$<AuditTrailFileExport> Fields;

	public Datetime CompletedDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FileDeletedById;
	public User FileDeletedBy;
	public Datetime FileDeletedDateTime;
	public String FileIdentifier;
	public String FileName;
	public Blob FileReferenceBody;
	public String FileReferenceContentType;
	public Integer FileReferenceLength;
	public String FileReferenceName;
	public String FileStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEmailSent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RequestIdentifier;
	public String RequestStatus;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuditTrailFileExportShare[] Shares;

	public AuditTrailFileExport clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuditTrailFileExport clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuditTrailFileExport clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuditTrailFileExport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuditTrailFileExport clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
