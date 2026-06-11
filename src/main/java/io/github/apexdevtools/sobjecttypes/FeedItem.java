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
public class FeedItem extends SObject {
	public static SObjectType$<FeedItem> SObjectType;
	public static SObjectFields$<FeedItem> Fields;

	public Id BestCommentId;
	public FeedComment BestComment;
	public String Body;
	public Integer CommentCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean HasContent;
	public Boolean HasFeedEntity;
	public Boolean HasLink;
	public Boolean HasVerifiedComment;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsRichText;
	public Id LastEditById;
	public User LastEditBy;
	public Datetime LastEditDate;
	public Datetime LastModifiedDate;
	public Integer LikeCount;
	public String LinkUrl;
	public String NetworkScope;
	public Id ParentId;
	public Name Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Integer Revision;
	public String Status;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;
	public String Visibility;

	public NetworkActivityAudit[] AuditableEntities;
	public FeedAttachment[] FeedAttachments;
	public FeedComment[] FeedComments;
	public WorkThanks[] FeedItemThanks;
	public FeedLike[] FeedLikes;
	public FeedRevision[] FeedRevisions;
	public FeedSignal[] FeedSignals;
	public FeedTrackedChange[] FeedTrackedChanges;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToFeedItem;
	public TopicAssignment[] TopicAssignments;

	public FeedItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
