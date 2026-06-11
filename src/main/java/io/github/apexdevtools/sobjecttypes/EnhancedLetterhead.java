/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EnhancedLetterhead extends SObject {
	public static SObjectType$<EnhancedLetterhead> SObjectType;
	public static SObjectFields$<EnhancedLetterhead> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LetterheadFooter;
	public String LetterheadHeader;
	public String Name;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EnhancedLetterheadFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public EnhancedLetterhead clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnhancedLetterhead clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnhancedLetterhead clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnhancedLetterhead clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnhancedLetterhead clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
