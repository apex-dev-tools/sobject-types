/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GrpCensusGrpClassSummaryFeed extends SObject {
	public static SObjectType$<GrpCensusGrpClassSummaryFeed> SObjectType;
	public static SObjectFields$<GrpCensusGrpClassSummaryFeed> Fields;

	public Id BestCommentId;
	public FeedComment BestComment;
	public String Body;
	public Integer CommentCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public Boolean IsDeleted;
	public Boolean IsRichText;
	public Datetime LastModifiedDate;
	public Integer LikeCount;
	public String LinkUrl;
	public Id ParentId;
	public GrpCensusGrpClassSummary Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;

	public FeedAttachment[] FeedAttachments;
	public FeedComment[] FeedComments;
	public FeedLike[] FeedLikes;
	public FeedSignal[] FeedSignals;
	public FeedTrackedChange[] FeedTrackedChanges;

	public GrpCensusGrpClassSummaryFeed clone$() {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryFeed clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryFeed clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryFeed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryFeed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
