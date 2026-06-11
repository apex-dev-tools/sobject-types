/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Topic extends SObject {
	public static SObjectType$<Topic> SObjectType;
	public static SObjectFields$<Topic> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public String ManagedTopicType;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public Datetime SystemModstamp;
	public Integer TalkingAbout;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CustomBrand[] CustomBrands;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public TopicFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ListEmailRecipientSource[] ListEmailRecipientSources;
	public TopicLocalization[] Localization;
	public NetworkActivityAudit[] ParentEntities;
	public TopicAssignment[] TopicAssignments;

	public Topic clone$() {throw new java.lang.UnsupportedOperationException();}
	public Topic clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Topic clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Topic clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Topic clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
