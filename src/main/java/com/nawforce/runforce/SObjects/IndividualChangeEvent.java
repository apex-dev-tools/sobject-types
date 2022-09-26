/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IndividualChangeEvent extends SObject {
	public static SObjectType$<IndividualChangeEvent> SObjectType;
	public static SObjectFields$<IndividualChangeEvent> Fields;

	public Date BirthDate;
	public Boolean CanStorePiiElsewhere;
	public Object ChangeEventHeader;
	public Integer ChildrenCount;
	public Integer ConsumerCreditScore;
	public String ConsumerCreditScoreProviderName;
	public Integer ConvictionsCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date DeathDate;
	public String FirstName;
	public Boolean HasOptedOutGeoTracking;
	public Boolean HasOptedOutProcessing;
	public Boolean HasOptedOutProfiling;
	public Boolean HasOptedOutSolicit;
	public Boolean HasOptedOutTracking;
	public Id Id;
	public String IndividualsAge;
	public Integer InfluencerRating;
	public Boolean IsHomeOwner;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public String MilitaryService;
	public String Name;
	public String Occupation;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String Salutation;
	public Boolean SendIndividualData;
	public Boolean ShouldForget;
	public String Website;

	public IndividualChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
