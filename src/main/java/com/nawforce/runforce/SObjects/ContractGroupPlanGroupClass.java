/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContractGroupPlanGroupClass extends SObject {
	public static SObjectType$<ContractGroupPlanGroupClass> SObjectType;
	public static SObjectFields$<ContractGroupPlanGroupClass> Fields;

	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id GroupClassId;
	public GroupClass GroupClass;
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

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContractGroupPlanGroupClassFeed[] Feeds;
	public ContractGroupPlanGroupClassHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContractGroupPlanGroupClassShare[] Shares;

	public ContractGroupPlanGroupClass clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClass clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClass clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}