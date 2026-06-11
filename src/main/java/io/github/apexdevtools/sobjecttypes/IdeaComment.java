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
public class IdeaComment extends SObject {
	public static SObjectType$<IdeaComment> SObjectType;
	public static SObjectFields$<IdeaComment> Fields;

	public String CommentBody;
	public Id CommunityId;
	public Community Community;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreatorFullPhotoUrl;
	public String CreatorName;
	public String CreatorSmallPhotoUrl;
	public Id Id;
	public Id IdeaId;
	public Idea Idea;
	public Boolean IsDeleted;
	public Boolean IsHtml;
	public Datetime SystemModstamp;
	public Integer UpVotes;

	public Vote[] Votes;

	public IdeaComment clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdeaComment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdeaComment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdeaComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdeaComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
