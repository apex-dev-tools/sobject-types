/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataSemanticSearch extends SObject {
	public static SObjectType$<DataSemanticSearch> SObjectType;
	public static SObjectFields$<DataSemanticSearch> Fields;

	public String AttachmentDmo;
	public String ChunkDmo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreationType;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public Id Id;
	public Datetime IndexRefreshedOn;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String PrimaryDmo;
	public String RuntimeStatus;
	public String SearchType;
	public String SemanticSearchApiName;
	public Datetime SystemModstamp;
	public String VectorDmo;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataSemanticSearchFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataSemanticSearchHistory[] Histories;

	public DataSemanticSearch clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataSemanticSearch clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataSemanticSearch clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataSemanticSearch clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataSemanticSearch clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
