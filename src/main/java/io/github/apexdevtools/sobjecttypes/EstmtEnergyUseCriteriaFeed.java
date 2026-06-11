/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EstmtEnergyUseCriteriaFeed extends SObject {
	public static SObjectType$<EstmtEnergyUseCriteriaFeed> SObjectType;
	public static SObjectFields$<EstmtEnergyUseCriteriaFeed> Fields;

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
	public EstmtEnergyUseCriteria Parent;
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

	public EstmtEnergyUseCriteriaFeed clone$() {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseCriteriaFeed clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseCriteriaFeed clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseCriteriaFeed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseCriteriaFeed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
