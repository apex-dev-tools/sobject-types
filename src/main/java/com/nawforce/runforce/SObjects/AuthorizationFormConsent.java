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
public class AuthorizationFormConsent extends SObject {
	public static SObjectType$<AuthorizationFormConsent> SObjectType;
	public static SObjectFields$<AuthorizationFormConsent> Fields;

	public Id AuthorizationFormTextId;
	public AuthorizationFormText AuthorizationFormText;
	public Datetime ConsentCapturedDateTime;
	public String ConsentCapturedSource;
	public String ConsentCapturedSourceType;
	public Id ConsentGiverId;
	public Name ConsentGiver;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DocumentVersionId;
	public ContentVersion DocumentVersion;
	public Id Id;
	public Id InfoAuthRequestFormId;
	public InfoAuthRequestForm InfoAuthRequestForm;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public DigitalSignature[] DigitalSignatures;
	public DigitalVerification[] DigitalVerificationParentReferenceRecord;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthorizationFormConsentHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InfoAuthRequestForm[] RequestFormAuthFormConsents;
	public AuthorizationFormConsentShare[] Shares;

	public AuthorizationFormConsent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
