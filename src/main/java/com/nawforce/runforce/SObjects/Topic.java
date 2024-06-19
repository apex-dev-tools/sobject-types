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
