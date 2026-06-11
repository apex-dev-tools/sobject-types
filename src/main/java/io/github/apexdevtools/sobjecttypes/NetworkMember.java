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
public class NetworkMember extends SObject {
	public static SObjectType$<NetworkMember> SObjectType;
	public static SObjectFields$<NetworkMember> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultGroupNotificationFrequency;
	public String DigestFrequency;
	public Id Id;
	public Date LastChatterActivityDate;
	public Id MemberId;
	public User Member;
	public Id NetworkId;
	public Network Network;
	public Boolean PreferencesDisCommentAfterLikeEmail;
	public Boolean PreferencesDisMentionsCommentEmail;
	public Boolean PreferencesDisProfPostCommentEmail;
	public Boolean PreferencesDisableAllFeedsEmail;
	public Boolean PreferencesDisableBestAnswerEmail;
	public Boolean PreferencesDisableBookmarkEmail;
	public Boolean PreferencesDisableChangeCommentEmail;
	public Boolean PreferencesDisableDirectMessageEmail;
	public Boolean PreferencesDisableEndorsementEmail;
	public Boolean PreferencesDisableFollowersEmail;
	public Boolean PreferencesDisableItemFlaggedEmail;
	public Boolean PreferencesDisableLaterCommentEmail;
	public Boolean PreferencesDisableLikeEmail;
	public Boolean PreferencesDisableMentionsPostEmail;
	public Boolean PreferencesDisableMessageEmail;
	public Boolean PreferencesDisablePendingReviewEmail;
	public Boolean PreferencesDisableProfilePostEmail;
	public Boolean PreferencesDisableSharePostEmail;
	public Decimal ReputationPoints;
	public Datetime SystemModstamp;

	public NetworkMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
