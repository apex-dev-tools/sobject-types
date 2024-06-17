/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SocialPersona extends SObject {
	public static SObjectType$<SocialPersona> SObjectType;
	public static SObjectFields$<SocialPersona> Fields;

	public Boolean AreWeFollowing;
	public String AuthorLabels;
	public String AvatarUrl;
	public String Bio;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalId;
	public String ExternalPictureURL;
	public Integer Followers;
	public Integer Following;
	public Id Id;
	public Integer InfluencerScore;
	public Boolean IsBlacklisted;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Boolean IsFollowingUs;
	public Boolean IsVerified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer ListedCount;
	public String MediaProvider;
	public String MediaType;
	public String Name;
	public Integer NumberOfFriends;
	public Integer NumberOfTweets;
	public Id ParentId;
	public Name Parent;
	public String ProfileType;
	public String ProfileUrl;
	public String Provider;
	public String R6SourceId;
	public String RealName;
	public String SourceApp;
	public Datetime SystemModstamp;
	public String TopicType;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public SocialPersonaHistory[] Histories;
	public SocialPost[] Posts;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public SocialPersona clone$() {throw new java.lang.UnsupportedOperationException();}
	public SocialPersona clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SocialPersona clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SocialPersona clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SocialPersona clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
