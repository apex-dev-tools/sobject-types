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
public class FeedComment extends SObject {
	public static SObjectType$<FeedComment> SObjectType;
	public static SObjectFields$<FeedComment> Fields;

	public String CommentBody;
	public String CommentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FeedItemId;
	public SObject FeedItem;
	public Boolean HasEntityLinks;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public Boolean IsDeleted;
	public Boolean IsRichText;
	public Boolean IsVerified;
	public Id LastEditById;
	public User LastEditBy;
	public Datetime LastEditDate;
	public Id ParentId;
	public SObject Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Integer Revision;
	public String Status;
	public Datetime SystemModstamp;
	public Integer ThreadChildrenCount;
	public Datetime ThreadLastUpdatedDate;
	public Integer ThreadLevel;
	public Id ThreadParentId;
	public FeedComment ThreadParent;

	public NetworkActivityAudit[] AuditableEntities;
	public FeedAttachment[] FeedAttachments;
	public FeedRevision[] FeedRevisions;
	public FeedComment[] FeedThreadedComments;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToFeedComment;

	public FeedComment clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
