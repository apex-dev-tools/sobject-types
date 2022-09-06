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
public class Territory2Model extends SObject {
	public static SObjectType$<Territory2Model> SObjectType;
	public static SObjectFields$<Territory2Model> Fields;

	public Datetime ActivatedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DeactivatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsCloneSource;
	public Boolean IsDeleted;
	public Boolean IsOppUnassignmentDone;
	public Boolean IsSharingGroupDeleteDone;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOppTerrAssignEndDate;
	public Datetime LastRunRulesEndDate;
	public String Name;
	public String State;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public Territory2ModelFeed[] Feeds;
	public Territory2ModelHistory[] Histories;
	public ObjectTerritory2AssignmentRule[] ObjectTerritory2AssignmentRules;
	public Territory2[] Territory2s;

	public Territory2Model clone$() {throw new java.lang.UnsupportedOperationException();}
	public Territory2Model clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Territory2Model clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Territory2Model clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Territory2Model clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
