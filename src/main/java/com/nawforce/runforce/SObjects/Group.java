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
public class Group extends SObject {
	public static SObjectType$<Group> SObjectType;
	public static SObjectFields$<Group> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultDivision;
	public String Description;
	public String DeveloperName;
	public Boolean DoesIncludeBosses;
	public Boolean DoesSendEmailToMembers;
	public String Email;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedId;
	public Name Related;
	public Datetime SystemModstamp;
	public String Type;

	public AssessmentTask[] AssessmentTaskAssignedTo;
	public ApprovalWorkItem[] AssignedWorkItems;
	public ComplaintParticipant[] ComplaintParticipants;
	public User[] DelegatedUsers;
	public DigitalVerification[] DigitalVerificationDesignatedVerifier;
	public GroupMember[] GroupMembers;
	public QueueSobject[] QueueSobjects;

	public Group clone$() {throw new java.lang.UnsupportedOperationException();}
	public Group clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Group clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Group clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Group clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
