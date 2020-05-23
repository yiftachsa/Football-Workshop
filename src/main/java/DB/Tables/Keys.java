/*
 * This file is generated by jOOQ.
 */
package DB.Tables;


import DB.Tables.tables.Alert;
import DB.Tables.tables.AssociationRepresentative;
import DB.Tables.tables.Coach;
import DB.Tables.tables.CoachInTeam;
import DB.Tables.tables.EventCard;
import DB.Tables.tables.EventGoal;
import DB.Tables.tables.EventInjury;
import DB.Tables.tables.EventOffside;
import DB.Tables.tables.EventPenalty;
import DB.Tables.tables.EventSwitchPlayers;
import DB.Tables.tables.Game;
import DB.Tables.tables.GamesInSeason;
import DB.Tables.tables.League;
import DB.Tables.tables.ManagerInTeams;
import DB.Tables.tables.OwnedTeams;
import DB.Tables.tables.Player;
import DB.Tables.tables.PlayerInTeam;
import DB.Tables.tables.PointsPolicy;
import DB.Tables.tables.Referee;
import DB.Tables.tables.RefereeInGame;
import DB.Tables.tables.RefereeInSeason;
import DB.Tables.tables.SchedulingPolicy;
import DB.Tables.tables.Season;
import DB.Tables.tables.Stadium;
import DB.Tables.tables.StadiumHomeTeams;
import DB.Tables.tables.SystemAdmin;
import DB.Tables.tables.Systemuser;
import DB.Tables.tables.Team;
import DB.Tables.tables.TeamManager;
import DB.Tables.tables.TeamOwner;
import DB.Tables.tables.TeamsInSeason;
import DB.Tables.tables.UserComplaint;
import DB.Tables.tables.UserRoles;
import DB.Tables.tables.records.AlertRecord;
import DB.Tables.tables.records.AssociationRepresentativeRecord;
import DB.Tables.tables.records.CoachInTeamRecord;
import DB.Tables.tables.records.CoachRecord;
import DB.Tables.tables.records.EventCardRecord;
import DB.Tables.tables.records.EventGoalRecord;
import DB.Tables.tables.records.EventInjuryRecord;
import DB.Tables.tables.records.EventOffsideRecord;
import DB.Tables.tables.records.EventPenaltyRecord;
import DB.Tables.tables.records.EventSwitchPlayersRecord;
import DB.Tables.tables.records.GameRecord;
import DB.Tables.tables.records.GamesInSeasonRecord;
import DB.Tables.tables.records.LeagueRecord;
import DB.Tables.tables.records.ManagerInTeamsRecord;
import DB.Tables.tables.records.OwnedTeamsRecord;
import DB.Tables.tables.records.PlayerInTeamRecord;
import DB.Tables.tables.records.PlayerRecord;
import DB.Tables.tables.records.PointsPolicyRecord;
import DB.Tables.tables.records.RefereeInGameRecord;
import DB.Tables.tables.records.RefereeInSeasonRecord;
import DB.Tables.tables.records.RefereeRecord;
import DB.Tables.tables.records.SchedulingPolicyRecord;
import DB.Tables.tables.records.SeasonRecord;
import DB.Tables.tables.records.StadiumHomeTeamsRecord;
import DB.Tables.tables.records.StadiumRecord;
import DB.Tables.tables.records.SystemAdminRecord;
import DB.Tables.tables.records.SystemuserRecord;
import DB.Tables.tables.records.TeamManagerRecord;
import DB.Tables.tables.records.TeamOwnerRecord;
import DB.Tables.tables.records.TeamRecord;
import DB.Tables.tables.records.TeamsInSeasonRecord;
import DB.Tables.tables.records.UserComplaintRecord;
import DB.Tables.tables.records.UserRolesRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>fwdb</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AlertRecord, Integer> IDENTITY_ALERT = Identities0.IDENTITY_ALERT;
    public static final Identity<EventCardRecord, Integer> IDENTITY_EVENT_CARD = Identities0.IDENTITY_EVENT_CARD;
    public static final Identity<EventGoalRecord, Integer> IDENTITY_EVENT_GOAL = Identities0.IDENTITY_EVENT_GOAL;
    public static final Identity<EventInjuryRecord, Integer> IDENTITY_EVENT_INJURY = Identities0.IDENTITY_EVENT_INJURY;
    public static final Identity<EventOffsideRecord, Integer> IDENTITY_EVENT_OFFSIDE = Identities0.IDENTITY_EVENT_OFFSIDE;
    public static final Identity<EventPenaltyRecord, Integer> IDENTITY_EVENT_PENALTY = Identities0.IDENTITY_EVENT_PENALTY;
    public static final Identity<EventSwitchPlayersRecord, Integer> IDENTITY_EVENT_SWITCH_PLAYERS = Identities0.IDENTITY_EVENT_SWITCH_PLAYERS;
    public static final Identity<GameRecord, Integer> IDENTITY_GAME = Identities0.IDENTITY_GAME;
    public static final Identity<PointsPolicyRecord, Integer> IDENTITY_POINTS_POLICY = Identities0.IDENTITY_POINTS_POLICY;
    public static final Identity<SeasonRecord, Integer> IDENTITY_SEASON = Identities0.IDENTITY_SEASON;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AlertRecord> KEY_ALERT_PRIMARY = UniqueKeys0.KEY_ALERT_PRIMARY;
    public static final UniqueKey<AssociationRepresentativeRecord> KEY_ASSOCIATION_REPRESENTATIVE_PRIMARY = UniqueKeys0.KEY_ASSOCIATION_REPRESENTATIVE_PRIMARY;
    public static final UniqueKey<CoachRecord> KEY_COACH_PRIMARY = UniqueKeys0.KEY_COACH_PRIMARY;
    public static final UniqueKey<CoachInTeamRecord> KEY_COACH_IN_TEAM_PRIMARY = UniqueKeys0.KEY_COACH_IN_TEAM_PRIMARY;
    public static final UniqueKey<EventCardRecord> KEY_EVENT_CARD_PRIMARY = UniqueKeys0.KEY_EVENT_CARD_PRIMARY;
    public static final UniqueKey<EventGoalRecord> KEY_EVENT_GOAL_PRIMARY = UniqueKeys0.KEY_EVENT_GOAL_PRIMARY;
    public static final UniqueKey<EventInjuryRecord> KEY_EVENT_INJURY_PRIMARY = UniqueKeys0.KEY_EVENT_INJURY_PRIMARY;
    public static final UniqueKey<EventOffsideRecord> KEY_EVENT_OFFSIDE_PRIMARY = UniqueKeys0.KEY_EVENT_OFFSIDE_PRIMARY;
    public static final UniqueKey<EventPenaltyRecord> KEY_EVENT_PENALTY_PRIMARY = UniqueKeys0.KEY_EVENT_PENALTY_PRIMARY;
    public static final UniqueKey<EventSwitchPlayersRecord> KEY_EVENT_SWITCH_PLAYERS_PRIMARY = UniqueKeys0.KEY_EVENT_SWITCH_PLAYERS_PRIMARY;
    public static final UniqueKey<GameRecord> KEY_GAME_PRIMARY = UniqueKeys0.KEY_GAME_PRIMARY;
    public static final UniqueKey<GamesInSeasonRecord> KEY_GAMES_IN_SEASON_PRIMARY = UniqueKeys0.KEY_GAMES_IN_SEASON_PRIMARY;
    public static final UniqueKey<LeagueRecord> KEY_LEAGUE_PRIMARY = UniqueKeys0.KEY_LEAGUE_PRIMARY;
    public static final UniqueKey<ManagerInTeamsRecord> KEY_MANAGER_IN_TEAMS_PRIMARY = UniqueKeys0.KEY_MANAGER_IN_TEAMS_PRIMARY;
    public static final UniqueKey<OwnedTeamsRecord> KEY_OWNED_TEAMS_PRIMARY = UniqueKeys0.KEY_OWNED_TEAMS_PRIMARY;
    public static final UniqueKey<PlayerRecord> KEY_PLAYER_PRIMARY = UniqueKeys0.KEY_PLAYER_PRIMARY;
    public static final UniqueKey<PlayerInTeamRecord> KEY_PLAYER_IN_TEAM_PRIMARY = UniqueKeys0.KEY_PLAYER_IN_TEAM_PRIMARY;
    public static final UniqueKey<PointsPolicyRecord> KEY_POINTS_POLICY_PRIMARY = UniqueKeys0.KEY_POINTS_POLICY_PRIMARY;
    public static final UniqueKey<RefereeRecord> KEY_REFEREE_PRIMARY = UniqueKeys0.KEY_REFEREE_PRIMARY;
    public static final UniqueKey<RefereeInGameRecord> KEY_REFEREE_IN_GAME_PRIMARY = UniqueKeys0.KEY_REFEREE_IN_GAME_PRIMARY;
    public static final UniqueKey<RefereeInSeasonRecord> KEY_REFEREE_IN_SEASON_PRIMARY = UniqueKeys0.KEY_REFEREE_IN_SEASON_PRIMARY;
    public static final UniqueKey<SchedulingPolicyRecord> KEY_SCHEDULING_POLICY_PRIMARY = UniqueKeys0.KEY_SCHEDULING_POLICY_PRIMARY;
    public static final UniqueKey<SeasonRecord> KEY_SEASON_PRIMARY = UniqueKeys0.KEY_SEASON_PRIMARY;
    public static final UniqueKey<StadiumRecord> KEY_STADIUM_PRIMARY = UniqueKeys0.KEY_STADIUM_PRIMARY;
    public static final UniqueKey<StadiumHomeTeamsRecord> KEY_STADIUM_HOME_TEAMS_PRIMARY = UniqueKeys0.KEY_STADIUM_HOME_TEAMS_PRIMARY;
    public static final UniqueKey<SystemAdminRecord> KEY_SYSTEM_ADMIN_PRIMARY = UniqueKeys0.KEY_SYSTEM_ADMIN_PRIMARY;
    public static final UniqueKey<SystemuserRecord> KEY_SYSTEMUSER_PRIMARY = UniqueKeys0.KEY_SYSTEMUSER_PRIMARY;
    public static final UniqueKey<TeamRecord> KEY_TEAM_PRIMARY = UniqueKeys0.KEY_TEAM_PRIMARY;
    public static final UniqueKey<TeamManagerRecord> KEY_TEAM_MANAGER_PRIMARY = UniqueKeys0.KEY_TEAM_MANAGER_PRIMARY;
    public static final UniqueKey<TeamOwnerRecord> KEY_TEAM_OWNER_PRIMARY = UniqueKeys0.KEY_TEAM_OWNER_PRIMARY;
    public static final UniqueKey<TeamsInSeasonRecord> KEY_TEAMS_IN_SEASON_PRIMARY = UniqueKeys0.KEY_TEAMS_IN_SEASON_PRIMARY;
    public static final UniqueKey<UserComplaintRecord> KEY_USER_COMPLAINT_PRIMARY = UniqueKeys0.KEY_USER_COMPLAINT_PRIMARY;
    public static final UniqueKey<UserRolesRecord> KEY_USER_ROLES_PRIMARY = UniqueKeys0.KEY_USER_ROLES_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AlertRecord, SystemuserRecord> FK_ALERT_SYSTEMUSER = ForeignKeys0.FK_ALERT_SYSTEMUSER;
    public static final ForeignKey<AssociationRepresentativeRecord, UserRolesRecord> FK__USER_ROLES_AR = ForeignKeys0.FK__USER_ROLES_AR;
    public static final ForeignKey<CoachRecord, UserRolesRecord> FK_COACH_USER_ROLES = ForeignKeys0.FK_COACH_USER_ROLES;
    public static final ForeignKey<CoachInTeamRecord, CoachRecord> FK_COACH_IN_TEAM_COACH = ForeignKeys0.FK_COACH_IN_TEAM_COACH;
    public static final ForeignKey<CoachInTeamRecord, TeamRecord> FK_COACH_IN_TEAM_TEAM = ForeignKeys0.FK_COACH_IN_TEAM_TEAM;
    public static final ForeignKey<EventCardRecord, GameRecord> FK_EVENT_CARD_GAME = ForeignKeys0.FK_EVENT_CARD_GAME;
    public static final ForeignKey<EventCardRecord, PlayerRecord> FK__PLAYER_CARD = ForeignKeys0.FK__PLAYER_CARD;
    public static final ForeignKey<EventGoalRecord, GameRecord> FK_EVENT_GOAL_GAME = ForeignKeys0.FK_EVENT_GOAL_GAME;
    public static final ForeignKey<EventGoalRecord, TeamRecord> FK_SCORED_TEAM_TEAM = ForeignKeys0.FK_SCORED_TEAM_TEAM;
    public static final ForeignKey<EventGoalRecord, TeamRecord> FK__TEAM_SCORED_ON = ForeignKeys0.FK__TEAM_SCORED_ON;
    public static final ForeignKey<EventGoalRecord, PlayerRecord> FK_EVENT_GOAL_PLAYER = ForeignKeys0.FK_EVENT_GOAL_PLAYER;
    public static final ForeignKey<EventInjuryRecord, GameRecord> FK_EVENT_INJURY_GAME = ForeignKeys0.FK_EVENT_INJURY_GAME;
    public static final ForeignKey<EventInjuryRecord, PlayerRecord> FK__PLAYER_INJURED = ForeignKeys0.FK__PLAYER_INJURED;
    public static final ForeignKey<EventOffsideRecord, GameRecord> FK_EVENT_OFFSIDE_GAME = ForeignKeys0.FK_EVENT_OFFSIDE_GAME;
    public static final ForeignKey<EventOffsideRecord, TeamRecord> FK__TEAM_OFFSIDE = ForeignKeys0.FK__TEAM_OFFSIDE;
    public static final ForeignKey<EventPenaltyRecord, GameRecord> FK_EVENT_PENALTY_GAME = ForeignKeys0.FK_EVENT_PENALTY_GAME;
    public static final ForeignKey<EventPenaltyRecord, TeamRecord> FK__TEAM_PENALTY = ForeignKeys0.FK__TEAM_PENALTY;
    public static final ForeignKey<EventSwitchPlayersRecord, GameRecord> FK_EVENT_SWITCH_PLAYERS_GAME = ForeignKeys0.FK_EVENT_SWITCH_PLAYERS_GAME;
    public static final ForeignKey<EventSwitchPlayersRecord, TeamRecord> FK_EVENT_SWITCH_PLAYERS_TEAM = ForeignKeys0.FK_EVENT_SWITCH_PLAYERS_TEAM;
    public static final ForeignKey<EventSwitchPlayersRecord, PlayerRecord> FK__PLAYER_ENTER = ForeignKeys0.FK__PLAYER_ENTER;
    public static final ForeignKey<EventSwitchPlayersRecord, PlayerRecord> FK__PLAYER_EXIT = ForeignKeys0.FK__PLAYER_EXIT;
    public static final ForeignKey<GameRecord, StadiumRecord> FK_GAME_STADIUM = ForeignKeys0.FK_GAME_STADIUM;
    public static final ForeignKey<GameRecord, TeamRecord> FK_GAME_TEAM = ForeignKeys0.FK_GAME_TEAM;
    public static final ForeignKey<GameRecord, TeamRecord> FK_GAME_TEAM_2 = ForeignKeys0.FK_GAME_TEAM_2;
    public static final ForeignKey<GamesInSeasonRecord, SeasonRecord> FK_GAMES_IN_SEASON_SEASON = ForeignKeys0.FK_GAMES_IN_SEASON_SEASON;
    public static final ForeignKey<GamesInSeasonRecord, GameRecord> FK_GAMES_IN_SEASON_GAME = ForeignKeys0.FK_GAMES_IN_SEASON_GAME;
    public static final ForeignKey<ManagerInTeamsRecord, TeamRecord> FK_MANAGED_TEAMS_TEAM = ForeignKeys0.FK_MANAGED_TEAMS_TEAM;
    public static final ForeignKey<OwnedTeamsRecord, TeamOwnerRecord> FK__TEAM_OWNER = ForeignKeys0.FK__TEAM_OWNER;
    public static final ForeignKey<OwnedTeamsRecord, TeamRecord> FK__TEAM = ForeignKeys0.FK__TEAM;
    public static final ForeignKey<PlayerRecord, UserRolesRecord> FK_PLAYER_USER_ROLES = ForeignKeys0.FK_PLAYER_USER_ROLES;
    public static final ForeignKey<PlayerInTeamRecord, PlayerRecord> FK__PLAYER = ForeignKeys0.FK__PLAYER;
    public static final ForeignKey<PlayerInTeamRecord, TeamRecord> FK_PLAYER_IN_TEAM_TEAM = ForeignKeys0.FK_PLAYER_IN_TEAM_TEAM;
    public static final ForeignKey<RefereeRecord, UserRolesRecord> FK_REFREE_USER_ROLES = ForeignKeys0.FK_REFREE_USER_ROLES;
    public static final ForeignKey<RefereeInGameRecord, RefereeRecord> FK__REFEREE = ForeignKeys0.FK__REFEREE;
    public static final ForeignKey<RefereeInGameRecord, GameRecord> FK_REFEREE_IN_GAME_GAME = ForeignKeys0.FK_REFEREE_IN_GAME_GAME;
    public static final ForeignKey<RefereeInSeasonRecord, RefereeRecord> FK_REFEREE_IN_SEASON_REFEREE = ForeignKeys0.FK_REFEREE_IN_SEASON_REFEREE;
    public static final ForeignKey<RefereeInSeasonRecord, SeasonRecord> FK_REFEREE_IN_SEASON_SEASON = ForeignKeys0.FK_REFEREE_IN_SEASON_SEASON;
    public static final ForeignKey<SeasonRecord, LeagueRecord> FK_SEASON_LEAGUE = ForeignKeys0.FK_SEASON_LEAGUE;
    public static final ForeignKey<SeasonRecord, PointsPolicyRecord> FK_SEASON_POINTS_POLICY = ForeignKeys0.FK_SEASON_POINTS_POLICY;
    public static final ForeignKey<StadiumHomeTeamsRecord, StadiumRecord> FK__STADIUM_TEAMS = ForeignKeys0.FK__STADIUM_TEAMS;
    public static final ForeignKey<StadiumHomeTeamsRecord, TeamRecord> FK__TEAM_STADIUM = ForeignKeys0.FK__TEAM_STADIUM;
    public static final ForeignKey<SystemAdminRecord, UserRolesRecord> FK__USER_ROLES_SYSTEM_ADMIN = ForeignKeys0.FK__USER_ROLES_SYSTEM_ADMIN;
    public static final ForeignKey<TeamManagerRecord, UserRolesRecord> FK_TEAM_MANAGER_USER_ROLES = ForeignKeys0.FK_TEAM_MANAGER_USER_ROLES;
    public static final ForeignKey<TeamManagerRecord, TeamOwnerRecord> FK_TEAM_MANAGER_TEAM_OWNER = ForeignKeys0.FK_TEAM_MANAGER_TEAM_OWNER;
    public static final ForeignKey<TeamOwnerRecord, UserRolesRecord> FK__USER_ROLES = ForeignKeys0.FK__USER_ROLES;
    public static final ForeignKey<TeamOwnerRecord, SystemuserRecord> FK_TEAM_OWNER_SYSTEMUSER = ForeignKeys0.FK_TEAM_OWNER_SYSTEMUSER;
    public static final ForeignKey<TeamsInSeasonRecord, SeasonRecord> FK_TEAMS_IN_SEASON_SEASON = ForeignKeys0.FK_TEAMS_IN_SEASON_SEASON;
    public static final ForeignKey<TeamsInSeasonRecord, TeamRecord> FK__TEAM_NAME = ForeignKeys0.FK__TEAM_NAME;
    public static final ForeignKey<UserComplaintRecord, SystemuserRecord> FK__SYSTEMUSER = ForeignKeys0.FK__SYSTEMUSER;
    public static final ForeignKey<UserRolesRecord, SystemuserRecord> FK_ROLE_SYSTEMUSER = ForeignKeys0.FK_ROLE_SYSTEMUSER;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AlertRecord, Integer> IDENTITY_ALERT = Internal.createIdentity(Alert.ALERT, Alert.ALERT.ALERT_ID);
        public static Identity<EventCardRecord, Integer> IDENTITY_EVENT_CARD = Internal.createIdentity(EventCard.EVENT_CARD, EventCard.EVENT_CARD.EVENT_ID);
        public static Identity<EventGoalRecord, Integer> IDENTITY_EVENT_GOAL = Internal.createIdentity(EventGoal.EVENT_GOAL, EventGoal.EVENT_GOAL.EVENT_ID);
        public static Identity<EventInjuryRecord, Integer> IDENTITY_EVENT_INJURY = Internal.createIdentity(EventInjury.EVENT_INJURY, EventInjury.EVENT_INJURY.EVENT_ID);
        public static Identity<EventOffsideRecord, Integer> IDENTITY_EVENT_OFFSIDE = Internal.createIdentity(EventOffside.EVENT_OFFSIDE, EventOffside.EVENT_OFFSIDE.EVENT_ID);
        public static Identity<EventPenaltyRecord, Integer> IDENTITY_EVENT_PENALTY = Internal.createIdentity(EventPenalty.EVENT_PENALTY, EventPenalty.EVENT_PENALTY.EVENT_ID);
        public static Identity<EventSwitchPlayersRecord, Integer> IDENTITY_EVENT_SWITCH_PLAYERS = Internal.createIdentity(EventSwitchPlayers.EVENT_SWITCH_PLAYERS, EventSwitchPlayers.EVENT_SWITCH_PLAYERS.EVENT_ID);
        public static Identity<GameRecord, Integer> IDENTITY_GAME = Internal.createIdentity(Game.GAME, Game.GAME.GAME_ID);
        public static Identity<PointsPolicyRecord, Integer> IDENTITY_POINTS_POLICY = Internal.createIdentity(PointsPolicy.POINTS_POLICY, PointsPolicy.POINTS_POLICY.POLICY_ID);
        public static Identity<SeasonRecord, Integer> IDENTITY_SEASON = Internal.createIdentity(Season.SEASON, Season.SEASON.SEASON_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AlertRecord> KEY_ALERT_PRIMARY = Internal.createUniqueKey(Alert.ALERT, "KEY_alert_PRIMARY", new TableField[] { Alert.ALERT.ALERT_ID }, true);
        public static final UniqueKey<AssociationRepresentativeRecord> KEY_ASSOCIATION_REPRESENTATIVE_PRIMARY = Internal.createUniqueKey(AssociationRepresentative.ASSOCIATION_REPRESENTATIVE, "KEY_association_representative_PRIMARY", new TableField[] { AssociationRepresentative.ASSOCIATION_REPRESENTATIVE.USERNAME }, true);
        public static final UniqueKey<CoachRecord> KEY_COACH_PRIMARY = Internal.createUniqueKey(Coach.COACH, "KEY_coach_PRIMARY", new TableField[] { Coach.COACH.USERNAME }, true);
        public static final UniqueKey<CoachInTeamRecord> KEY_COACH_IN_TEAM_PRIMARY = Internal.createUniqueKey(CoachInTeam.COACH_IN_TEAM, "KEY_coach_in_team_PRIMARY", new TableField[] { CoachInTeam.COACH_IN_TEAM.USERNAME, CoachInTeam.COACH_IN_TEAM.TEAM_NAME }, true);
        public static final UniqueKey<EventCardRecord> KEY_EVENT_CARD_PRIMARY = Internal.createUniqueKey(EventCard.EVENT_CARD, "KEY_event_card_PRIMARY", new TableField[] { EventCard.EVENT_CARD.EVENT_ID }, true);
        public static final UniqueKey<EventGoalRecord> KEY_EVENT_GOAL_PRIMARY = Internal.createUniqueKey(EventGoal.EVENT_GOAL, "KEY_event_goal_PRIMARY", new TableField[] { EventGoal.EVENT_GOAL.EVENT_ID }, true);
        public static final UniqueKey<EventInjuryRecord> KEY_EVENT_INJURY_PRIMARY = Internal.createUniqueKey(EventInjury.EVENT_INJURY, "KEY_event_injury_PRIMARY", new TableField[] { EventInjury.EVENT_INJURY.EVENT_ID }, true);
        public static final UniqueKey<EventOffsideRecord> KEY_EVENT_OFFSIDE_PRIMARY = Internal.createUniqueKey(EventOffside.EVENT_OFFSIDE, "KEY_event_offside_PRIMARY", new TableField[] { EventOffside.EVENT_OFFSIDE.EVENT_ID }, true);
        public static final UniqueKey<EventPenaltyRecord> KEY_EVENT_PENALTY_PRIMARY = Internal.createUniqueKey(EventPenalty.EVENT_PENALTY, "KEY_event_penalty_PRIMARY", new TableField[] { EventPenalty.EVENT_PENALTY.EVENT_ID }, true);
        public static final UniqueKey<EventSwitchPlayersRecord> KEY_EVENT_SWITCH_PLAYERS_PRIMARY = Internal.createUniqueKey(EventSwitchPlayers.EVENT_SWITCH_PLAYERS, "KEY_event_switch_players_PRIMARY", new TableField[] { EventSwitchPlayers.EVENT_SWITCH_PLAYERS.EVENT_ID }, true);
        public static final UniqueKey<GameRecord> KEY_GAME_PRIMARY = Internal.createUniqueKey(Game.GAME, "KEY_game_PRIMARY", new TableField[] { Game.GAME.GAME_ID }, true);
        public static final UniqueKey<GamesInSeasonRecord> KEY_GAMES_IN_SEASON_PRIMARY = Internal.createUniqueKey(GamesInSeason.GAMES_IN_SEASON, "KEY_games_in_season_PRIMARY", new TableField[] { GamesInSeason.GAMES_IN_SEASON.SEASON_ID, GamesInSeason.GAMES_IN_SEASON.GAME_ID }, true);
        public static final UniqueKey<LeagueRecord> KEY_LEAGUE_PRIMARY = Internal.createUniqueKey(League.LEAGUE, "KEY_league_PRIMARY", new TableField[] { League.LEAGUE.NAME }, true);
        public static final UniqueKey<ManagerInTeamsRecord> KEY_MANAGER_IN_TEAMS_PRIMARY = Internal.createUniqueKey(ManagerInTeams.MANAGER_IN_TEAMS, "KEY_manager_in_teams_PRIMARY", new TableField[] { ManagerInTeams.MANAGER_IN_TEAMS.USERNAME, ManagerInTeams.MANAGER_IN_TEAMS.TEAM_NAME }, true);
        public static final UniqueKey<OwnedTeamsRecord> KEY_OWNED_TEAMS_PRIMARY = Internal.createUniqueKey(OwnedTeams.OWNED_TEAMS, "KEY_owned_teams_PRIMARY", new TableField[] { OwnedTeams.OWNED_TEAMS.USERNAME, OwnedTeams.OWNED_TEAMS.TEAM_NAME }, true);
        public static final UniqueKey<PlayerRecord> KEY_PLAYER_PRIMARY = Internal.createUniqueKey(Player.PLAYER, "KEY_player_PRIMARY", new TableField[] { Player.PLAYER.USERNAME }, true);
        public static final UniqueKey<PlayerInTeamRecord> KEY_PLAYER_IN_TEAM_PRIMARY = Internal.createUniqueKey(PlayerInTeam.PLAYER_IN_TEAM, "KEY_player_in_team_PRIMARY", new TableField[] { PlayerInTeam.PLAYER_IN_TEAM.USERNAME, PlayerInTeam.PLAYER_IN_TEAM.TEAM_NAME }, true);
        public static final UniqueKey<PointsPolicyRecord> KEY_POINTS_POLICY_PRIMARY = Internal.createUniqueKey(PointsPolicy.POINTS_POLICY, "KEY_points_policy_PRIMARY", new TableField[] { PointsPolicy.POINTS_POLICY.POLICY_ID }, true);
        public static final UniqueKey<RefereeRecord> KEY_REFEREE_PRIMARY = Internal.createUniqueKey(Referee.REFEREE, "KEY_referee_PRIMARY", new TableField[] { Referee.REFEREE.USERNAME }, true);
        public static final UniqueKey<RefereeInGameRecord> KEY_REFEREE_IN_GAME_PRIMARY = Internal.createUniqueKey(RefereeInGame.REFEREE_IN_GAME, "KEY_referee_in_game_PRIMARY", new TableField[] { RefereeInGame.REFEREE_IN_GAME.USERNAME, RefereeInGame.REFEREE_IN_GAME.GAME_ID }, true);
        public static final UniqueKey<RefereeInSeasonRecord> KEY_REFEREE_IN_SEASON_PRIMARY = Internal.createUniqueKey(RefereeInSeason.REFEREE_IN_SEASON, "KEY_referee_in_season_PRIMARY", new TableField[] { RefereeInSeason.REFEREE_IN_SEASON.USERNAME, RefereeInSeason.REFEREE_IN_SEASON.SEASON_ID }, true);
        public static final UniqueKey<SchedulingPolicyRecord> KEY_SCHEDULING_POLICY_PRIMARY = Internal.createUniqueKey(SchedulingPolicy.SCHEDULING_POLICY, "KEY_scheduling_policy_PRIMARY", new TableField[] { SchedulingPolicy.SCHEDULING_POLICY.SCHEDULING_ID }, true);
        public static final UniqueKey<SeasonRecord> KEY_SEASON_PRIMARY = Internal.createUniqueKey(Season.SEASON, "KEY_season_PRIMARY", new TableField[] { Season.SEASON.SEASON_ID, Season.SEASON.LEAGUE_NAME, Season.SEASON.YEARS }, true);
        public static final UniqueKey<StadiumRecord> KEY_STADIUM_PRIMARY = Internal.createUniqueKey(Stadium.STADIUM, "KEY_stadium_PRIMARY", new TableField[] { Stadium.STADIUM.STADIUM_ID }, true);
        public static final UniqueKey<StadiumHomeTeamsRecord> KEY_STADIUM_HOME_TEAMS_PRIMARY = Internal.createUniqueKey(StadiumHomeTeams.STADIUM_HOME_TEAMS, "KEY_stadium_home_teams_PRIMARY", new TableField[] { StadiumHomeTeams.STADIUM_HOME_TEAMS.STADIUM_ID, StadiumHomeTeams.STADIUM_HOME_TEAMS.TEAM_NAME }, true);
        public static final UniqueKey<SystemAdminRecord> KEY_SYSTEM_ADMIN_PRIMARY = Internal.createUniqueKey(SystemAdmin.SYSTEM_ADMIN, "KEY_system_admin_PRIMARY", new TableField[] { SystemAdmin.SYSTEM_ADMIN.USERNAME }, true);
        public static final UniqueKey<SystemuserRecord> KEY_SYSTEMUSER_PRIMARY = Internal.createUniqueKey(Systemuser.SYSTEMUSER, "KEY_systemuser_PRIMARY", new TableField[] { Systemuser.SYSTEMUSER.USERNAME }, true);
        public static final UniqueKey<TeamRecord> KEY_TEAM_PRIMARY = Internal.createUniqueKey(Team.TEAM, "KEY_team_PRIMARY", new TableField[] { Team.TEAM.NAME }, true);
        public static final UniqueKey<TeamManagerRecord> KEY_TEAM_MANAGER_PRIMARY = Internal.createUniqueKey(TeamManager.TEAM_MANAGER, "KEY_team_manager_PRIMARY", new TableField[] { TeamManager.TEAM_MANAGER.APPOINTER, TeamManager.TEAM_MANAGER.USERNAME }, true);
        public static final UniqueKey<TeamOwnerRecord> KEY_TEAM_OWNER_PRIMARY = Internal.createUniqueKey(TeamOwner.TEAM_OWNER, "KEY_team_owner_PRIMARY", new TableField[] { TeamOwner.TEAM_OWNER.USERNAME }, true);
        public static final UniqueKey<TeamsInSeasonRecord> KEY_TEAMS_IN_SEASON_PRIMARY = Internal.createUniqueKey(TeamsInSeason.TEAMS_IN_SEASON, "KEY_teams_in_season_PRIMARY", new TableField[] { TeamsInSeason.TEAMS_IN_SEASON.SEASON_ID, TeamsInSeason.TEAMS_IN_SEASON.TEAM_NAME }, true);
        public static final UniqueKey<UserComplaintRecord> KEY_USER_COMPLAINT_PRIMARY = Internal.createUniqueKey(UserComplaint.USER_COMPLAINT, "KEY_user_complaint_PRIMARY", new TableField[] { UserComplaint.USER_COMPLAINT.COMPLAINT_ID }, true);
        public static final UniqueKey<UserRolesRecord> KEY_USER_ROLES_PRIMARY = Internal.createUniqueKey(UserRoles.USER_ROLES, "KEY_user_roles_PRIMARY", new TableField[] { UserRoles.USER_ROLES.USERNAME, UserRoles.USER_ROLES.ROLE_TYPE }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AlertRecord, SystemuserRecord> FK_ALERT_SYSTEMUSER = Internal.createForeignKey(Keys.KEY_SYSTEMUSER_PRIMARY, Alert.ALERT, "FK_alert_systemuser", new TableField[] { Alert.ALERT.USERNAME }, true);
        public static final ForeignKey<AssociationRepresentativeRecord, UserRolesRecord> FK__USER_ROLES_AR = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, AssociationRepresentative.ASSOCIATION_REPRESENTATIVE, "FK__user_roles_AR", new TableField[] { AssociationRepresentative.ASSOCIATION_REPRESENTATIVE.USERNAME }, true);
        public static final ForeignKey<CoachRecord, UserRolesRecord> FK_COACH_USER_ROLES = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, Coach.COACH, "FK_coach_user_roles", new TableField[] { Coach.COACH.USERNAME }, true);
        public static final ForeignKey<CoachInTeamRecord, CoachRecord> FK_COACH_IN_TEAM_COACH = Internal.createForeignKey(Keys.KEY_COACH_PRIMARY, CoachInTeam.COACH_IN_TEAM, "FK_coach_in_team_coach", new TableField[] { CoachInTeam.COACH_IN_TEAM.USERNAME }, true);
        public static final ForeignKey<CoachInTeamRecord, TeamRecord> FK_COACH_IN_TEAM_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, CoachInTeam.COACH_IN_TEAM, "FK_coach_in_team_team", new TableField[] { CoachInTeam.COACH_IN_TEAM.TEAM_NAME }, true);
        public static final ForeignKey<EventCardRecord, GameRecord> FK_EVENT_CARD_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventCard.EVENT_CARD, "FK_event_card_game", new TableField[] { EventCard.EVENT_CARD.GAME_ID }, true);
        public static final ForeignKey<EventCardRecord, PlayerRecord> FK__PLAYER_CARD = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, EventCard.EVENT_CARD, "FK__player_card", new TableField[] { EventCard.EVENT_CARD.OFFENDER_NAME }, true);
        public static final ForeignKey<EventGoalRecord, GameRecord> FK_EVENT_GOAL_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventGoal.EVENT_GOAL, "FK_event_goal_game", new TableField[] { EventGoal.EVENT_GOAL.GAME_ID }, true);
        public static final ForeignKey<EventGoalRecord, TeamRecord> FK_SCORED_TEAM_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, EventGoal.EVENT_GOAL, "FK_scored_team_team", new TableField[] { EventGoal.EVENT_GOAL.SCORED_TEAM }, true);
        public static final ForeignKey<EventGoalRecord, TeamRecord> FK__TEAM_SCORED_ON = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, EventGoal.EVENT_GOAL, "FK__team_scored_on", new TableField[] { EventGoal.EVENT_GOAL.SCORED_ON_TEAM }, true);
        public static final ForeignKey<EventGoalRecord, PlayerRecord> FK_EVENT_GOAL_PLAYER = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, EventGoal.EVENT_GOAL, "FK_event_goal_player", new TableField[] { EventGoal.EVENT_GOAL.SCORER_NAME }, true);
        public static final ForeignKey<EventInjuryRecord, GameRecord> FK_EVENT_INJURY_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventInjury.EVENT_INJURY, "FK_event_injury_game", new TableField[] { EventInjury.EVENT_INJURY.GAME_ID }, true);
        public static final ForeignKey<EventInjuryRecord, PlayerRecord> FK__PLAYER_INJURED = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, EventInjury.EVENT_INJURY, "FK__player_injured", new TableField[] { EventInjury.EVENT_INJURY.INJURED_NAME }, true);
        public static final ForeignKey<EventOffsideRecord, GameRecord> FK_EVENT_OFFSIDE_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventOffside.EVENT_OFFSIDE, "FK_event_offside_game", new TableField[] { EventOffside.EVENT_OFFSIDE.GAME_ID }, true);
        public static final ForeignKey<EventOffsideRecord, TeamRecord> FK__TEAM_OFFSIDE = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, EventOffside.EVENT_OFFSIDE, "FK__team_offside", new TableField[] { EventOffside.EVENT_OFFSIDE.TEAM_NAME }, true);
        public static final ForeignKey<EventPenaltyRecord, GameRecord> FK_EVENT_PENALTY_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventPenalty.EVENT_PENALTY, "FK_event_penalty_game", new TableField[] { EventPenalty.EVENT_PENALTY.GAME_ID }, true);
        public static final ForeignKey<EventPenaltyRecord, TeamRecord> FK__TEAM_PENALTY = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, EventPenalty.EVENT_PENALTY, "FK__team_penalty", new TableField[] { EventPenalty.EVENT_PENALTY.TEAM_NAME }, true);
        public static final ForeignKey<EventSwitchPlayersRecord, GameRecord> FK_EVENT_SWITCH_PLAYERS_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, EventSwitchPlayers.EVENT_SWITCH_PLAYERS, "FK_event_switch_players_game", new TableField[] { EventSwitchPlayers.EVENT_SWITCH_PLAYERS.GAME_ID }, true);
        public static final ForeignKey<EventSwitchPlayersRecord, TeamRecord> FK_EVENT_SWITCH_PLAYERS_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, EventSwitchPlayers.EVENT_SWITCH_PLAYERS, "FK_event_switch_players_team", new TableField[] { EventSwitchPlayers.EVENT_SWITCH_PLAYERS.TEAM_NAME }, true);
        public static final ForeignKey<EventSwitchPlayersRecord, PlayerRecord> FK__PLAYER_ENTER = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, EventSwitchPlayers.EVENT_SWITCH_PLAYERS, "FK__player_enter", new TableField[] { EventSwitchPlayers.EVENT_SWITCH_PLAYERS.ENTERING_PLAYER }, true);
        public static final ForeignKey<EventSwitchPlayersRecord, PlayerRecord> FK__PLAYER_EXIT = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, EventSwitchPlayers.EVENT_SWITCH_PLAYERS, "FK__player_exit", new TableField[] { EventSwitchPlayers.EVENT_SWITCH_PLAYERS.EXITING_PLAYER }, true);
        public static final ForeignKey<GameRecord, StadiumRecord> FK_GAME_STADIUM = Internal.createForeignKey(Keys.KEY_STADIUM_PRIMARY, Game.GAME, "FK_game_stadium", new TableField[] { Game.GAME.STADIUM_ID }, true);
        public static final ForeignKey<GameRecord, TeamRecord> FK_GAME_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, Game.GAME, "FK_game_team", new TableField[] { Game.GAME.HOME_TEAM }, true);
        public static final ForeignKey<GameRecord, TeamRecord> FK_GAME_TEAM_2 = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, Game.GAME, "FK_game_team_2", new TableField[] { Game.GAME.AWAY_TEAM }, true);
        public static final ForeignKey<GamesInSeasonRecord, SeasonRecord> FK_GAMES_IN_SEASON_SEASON = Internal.createForeignKey(Keys.KEY_SEASON_PRIMARY, GamesInSeason.GAMES_IN_SEASON, "FK_games_in_season_season", new TableField[] { GamesInSeason.GAMES_IN_SEASON.SEASON_ID }, true);
        public static final ForeignKey<GamesInSeasonRecord, GameRecord> FK_GAMES_IN_SEASON_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, GamesInSeason.GAMES_IN_SEASON, "FK_games_in_season_game", new TableField[] { GamesInSeason.GAMES_IN_SEASON.GAME_ID }, true);
        public static final ForeignKey<ManagerInTeamsRecord, TeamRecord> FK_MANAGED_TEAMS_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, ManagerInTeams.MANAGER_IN_TEAMS, "FK_managed_teams_team", new TableField[] { ManagerInTeams.MANAGER_IN_TEAMS.TEAM_NAME }, true);
        public static final ForeignKey<OwnedTeamsRecord, TeamOwnerRecord> FK__TEAM_OWNER = Internal.createForeignKey(Keys.KEY_TEAM_OWNER_PRIMARY, OwnedTeams.OWNED_TEAMS, "FK__team_owner", new TableField[] { OwnedTeams.OWNED_TEAMS.USERNAME }, true);
        public static final ForeignKey<OwnedTeamsRecord, TeamRecord> FK__TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, OwnedTeams.OWNED_TEAMS, "FK__team", new TableField[] { OwnedTeams.OWNED_TEAMS.TEAM_NAME }, true);
        public static final ForeignKey<PlayerRecord, UserRolesRecord> FK_PLAYER_USER_ROLES = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, Player.PLAYER, "FK_player_user_roles", new TableField[] { Player.PLAYER.USERNAME }, true);
        public static final ForeignKey<PlayerInTeamRecord, PlayerRecord> FK__PLAYER = Internal.createForeignKey(Keys.KEY_PLAYER_PRIMARY, PlayerInTeam.PLAYER_IN_TEAM, "FK__player", new TableField[] { PlayerInTeam.PLAYER_IN_TEAM.USERNAME }, true);
        public static final ForeignKey<PlayerInTeamRecord, TeamRecord> FK_PLAYER_IN_TEAM_TEAM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, PlayerInTeam.PLAYER_IN_TEAM, "FK_player_in_team_team", new TableField[] { PlayerInTeam.PLAYER_IN_TEAM.TEAM_NAME }, true);
        public static final ForeignKey<RefereeRecord, UserRolesRecord> FK_REFREE_USER_ROLES = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, Referee.REFEREE, "FK_refree_user_roles", new TableField[] { Referee.REFEREE.USERNAME }, true);
        public static final ForeignKey<RefereeInGameRecord, RefereeRecord> FK__REFEREE = Internal.createForeignKey(Keys.KEY_REFEREE_PRIMARY, RefereeInGame.REFEREE_IN_GAME, "FK__referee", new TableField[] { RefereeInGame.REFEREE_IN_GAME.USERNAME }, true);
        public static final ForeignKey<RefereeInGameRecord, GameRecord> FK_REFEREE_IN_GAME_GAME = Internal.createForeignKey(Keys.KEY_GAME_PRIMARY, RefereeInGame.REFEREE_IN_GAME, "FK_referee_in_game_game", new TableField[] { RefereeInGame.REFEREE_IN_GAME.GAME_ID }, true);
        public static final ForeignKey<RefereeInSeasonRecord, RefereeRecord> FK_REFEREE_IN_SEASON_REFEREE = Internal.createForeignKey(Keys.KEY_REFEREE_PRIMARY, RefereeInSeason.REFEREE_IN_SEASON, "FK_referee_in_season_referee", new TableField[] { RefereeInSeason.REFEREE_IN_SEASON.USERNAME }, true);
        public static final ForeignKey<RefereeInSeasonRecord, SeasonRecord> FK_REFEREE_IN_SEASON_SEASON = Internal.createForeignKey(Keys.KEY_SEASON_PRIMARY, RefereeInSeason.REFEREE_IN_SEASON, "FK_referee_in_season_season", new TableField[] { RefereeInSeason.REFEREE_IN_SEASON.SEASON_ID }, true);
        public static final ForeignKey<SeasonRecord, LeagueRecord> FK_SEASON_LEAGUE = Internal.createForeignKey(Keys.KEY_LEAGUE_PRIMARY, Season.SEASON, "FK_season_league", new TableField[] { Season.SEASON.LEAGUE_NAME }, true);
        public static final ForeignKey<SeasonRecord, PointsPolicyRecord> FK_SEASON_POINTS_POLICY = Internal.createForeignKey(Keys.KEY_POINTS_POLICY_PRIMARY, Season.SEASON, "FK_season_points_policy", new TableField[] { Season.SEASON.POINTS_POLICY_ID }, true);
        public static final ForeignKey<StadiumHomeTeamsRecord, StadiumRecord> FK__STADIUM_TEAMS = Internal.createForeignKey(Keys.KEY_STADIUM_PRIMARY, StadiumHomeTeams.STADIUM_HOME_TEAMS, "FK__stadium_teams", new TableField[] { StadiumHomeTeams.STADIUM_HOME_TEAMS.STADIUM_ID }, true);
        public static final ForeignKey<StadiumHomeTeamsRecord, TeamRecord> FK__TEAM_STADIUM = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, StadiumHomeTeams.STADIUM_HOME_TEAMS, "FK__team_stadium", new TableField[] { StadiumHomeTeams.STADIUM_HOME_TEAMS.TEAM_NAME }, true);
        public static final ForeignKey<SystemAdminRecord, UserRolesRecord> FK__USER_ROLES_SYSTEM_ADMIN = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, SystemAdmin.SYSTEM_ADMIN, "FK__user_roles_system_admin", new TableField[] { SystemAdmin.SYSTEM_ADMIN.USERNAME }, true);
        public static final ForeignKey<TeamManagerRecord, UserRolesRecord> FK_TEAM_MANAGER_USER_ROLES = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, TeamManager.TEAM_MANAGER, "FK_team_manager_user_roles", new TableField[] { TeamManager.TEAM_MANAGER.USERNAME }, true);
        public static final ForeignKey<TeamManagerRecord, TeamOwnerRecord> FK_TEAM_MANAGER_TEAM_OWNER = Internal.createForeignKey(Keys.KEY_TEAM_OWNER_PRIMARY, TeamManager.TEAM_MANAGER, "FK_team_manager_team_owner", new TableField[] { TeamManager.TEAM_MANAGER.APPOINTER }, true);
        public static final ForeignKey<TeamOwnerRecord, UserRolesRecord> FK__USER_ROLES = Internal.createForeignKey(Keys.KEY_USER_ROLES_PRIMARY, TeamOwner.TEAM_OWNER, "FK__user_roles", new TableField[] { TeamOwner.TEAM_OWNER.USERNAME }, true);
        public static final ForeignKey<TeamOwnerRecord, SystemuserRecord> FK_TEAM_OWNER_SYSTEMUSER = Internal.createForeignKey(Keys.KEY_SYSTEMUSER_PRIMARY, TeamOwner.TEAM_OWNER, "FK_team_owner_systemuser", new TableField[] { TeamOwner.TEAM_OWNER.APPOINTER }, true);
        public static final ForeignKey<TeamsInSeasonRecord, SeasonRecord> FK_TEAMS_IN_SEASON_SEASON = Internal.createForeignKey(Keys.KEY_SEASON_PRIMARY, TeamsInSeason.TEAMS_IN_SEASON, "FK_teams_in_season_season", new TableField[] { TeamsInSeason.TEAMS_IN_SEASON.SEASON_ID }, true);
        public static final ForeignKey<TeamsInSeasonRecord, TeamRecord> FK__TEAM_NAME = Internal.createForeignKey(Keys.KEY_TEAM_PRIMARY, TeamsInSeason.TEAMS_IN_SEASON, "FK__team_name", new TableField[] { TeamsInSeason.TEAMS_IN_SEASON.TEAM_NAME }, true);
        public static final ForeignKey<UserComplaintRecord, SystemuserRecord> FK__SYSTEMUSER = Internal.createForeignKey(Keys.KEY_SYSTEMUSER_PRIMARY, UserComplaint.USER_COMPLAINT, "FK__systemuser", new TableField[] { UserComplaint.USER_COMPLAINT.USERNAME }, true);
        public static final ForeignKey<UserRolesRecord, SystemuserRecord> FK_ROLE_SYSTEMUSER = Internal.createForeignKey(Keys.KEY_SYSTEMUSER_PRIMARY, UserRoles.USER_ROLES, "FK_role_systemuser", new TableField[] { UserRoles.USER_ROLES.USERNAME }, true);
    }
}