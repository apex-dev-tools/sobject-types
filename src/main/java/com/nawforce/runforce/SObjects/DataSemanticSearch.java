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
