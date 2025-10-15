/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataSpace extends SObject {
	public static SObjectType$<DataSpace> SObjectType;
	public static SObjectFields$<DataSpace> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataSpaceApiName;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;

	public AbnExperiment[] AbnExperiments;
	public AttachedContentDocument[] AttachedContentDocuments;
	public AttribModel[] AttribModels;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EngagementSignal[] EngagementSignals;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataSpaceFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataSpaceHistory[] Histories;
	public PersnlBatchDecision[] PersnlBatchDecisions;
	public PersonalizationObjective[] PersonalizationObjectives;
	public PersonalizationPoint[] PersonalizationPoints;
	public PersonalizationRecommender[] PersonalizationRecommenders;
	public PersonalizationSchema[] PersonalizationSchemas;

	public DataSpace clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataSpace clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataSpace clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataSpace clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataSpace clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
