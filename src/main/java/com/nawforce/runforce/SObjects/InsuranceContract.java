/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsuranceContract extends SObject {
	public static SObjectType$<InsuranceContract> SObjectType;
	public static SObjectFields$<InsuranceContract> Fields;

	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EnrollmentCensusId;
	public GroupCensus EnrollmentCensus;
	public Date EnrollmentEndDate;
	public Date EnrollmentStartDate;
	public Integer EnrollmentWaitingPeriod;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public Id UnderwriterId;
	public User Underwriter;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InsuranceContractFeed[] Feeds;
	public InsuranceContractHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InsuranceContractShare[] Shares;

	public InsuranceContract clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContract clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContract clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContract clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContract clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
